package com.mogames.mod;

import com.mogames.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MGGlobal.Mod_ID, name = MGGlobal.Mod_Name, version = MGGlobal.Version)
public class Main {
	
	@Instance(MGGlobal.Mod_ID)
	public static Main instance;
	
	@SidedProxy(clientSide = MGGlobal.MG_CLIENT_PROXY, serverSide = MGGlobal.MG_SERVER_PROXY)
	public static CommonProxy proxy;
	
	    @EventHandler
	    public void Preinit(FMLPreInitializationEvent preevent){
	    
	    	proxy.preInit(preevent);
	    	
	    }
	    
	    	   @EventHandler
	   	    public void init(FMLInitializationEvent event){
	    		   
	    		   proxy.init(event);
	   	    }
	    		   @EventHandler
	    		    public void postinit(FMLPostInitializationEvent postevent){
	    			  
	    			   proxy.postInit(postevent);
	    }
	}


