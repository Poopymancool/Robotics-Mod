package com.primeto.roboticsmod.event;

import com.primeto.roboticsmod.entity.ModEntityTypes;
import com.primeto.roboticsmod.entity.custom.DrillRobotEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.DRILL_ROBOT.get(), DrillRobotEntity.setCustomAttributes().create());
    }
}
