package com.mogames.mod.proxy;

import com.mogames.mod.render.MGBlockRender;
import com.mogames.mod.render.MGItemRender;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent preevent){
		
		super.preInit(preevent);
		
	}
public void Init(FMLInitializationEvent event){
	super.init(event);
	MGBlockRender.registerBlockRender();
	MGItemRender.registerItemRender();
	}
public void postInit(FMLPostInitializationEvent postevent){
	super.postInit(postevent);
	}
}
