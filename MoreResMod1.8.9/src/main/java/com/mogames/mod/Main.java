package com.mogames.mod;

import com.mogames.mod.Proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;

@Mod(modid = MGGlobal.Mod_ID, name = MGGlobal.Mod_Name, version = MGGlobal.Version)
public class Main {
	
	@Instance(MGGlobal.Mod_ID)
	public static Main instance;
	
	@SidedProxy(clientSide = MGGlobal.MG_CLIENT_PROXY, serverSide = MGGlobal.MG_COMMON_PROXY)
	public static CommonProxy proxy;
	
	    @EventHandler
	    public void Preinit(FMLPreInitializationEvent preevent){
	    
	    	this.proxy.preInit(preevent);
	    	
	    }
	    
	    	   @EventHandler
	   	    public void init(FMLInitializationEvent event){
	    		   
	    		   this.proxy.init(event);
	   	    }
	    		   @EventHandler
	    		    public void postinit(FMLPostInitializationEvent postevent){
	    			  
	    			   this.proxy.postInit(postevent);
	    }
	}


