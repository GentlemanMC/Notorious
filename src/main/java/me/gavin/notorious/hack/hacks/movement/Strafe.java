package me.gavin.notorious.hack.hacks.movement;

import me.gavin.notorious.event.events.PlayerLivingUpdateEvent;
import me.gavin.notorious.hack.Hack;
import me.gavin.notorious.hack.RegisterHack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author gerald0mc
 * @since 7/5/21
 * :troll:
 */

@RegisterHack(name = "Strafe", description = "ching chong strafe", category = Hack.Category.Movement)
public class Strafe extends Hack {

    @SubscribeEvent
    public void onUpdate(PlayerLivingUpdateEvent event) {
        if(mc.player.onGround && !mc.player.isSneaking() && !mc.player.isInLava() && !mc.player.isInWater()) {
            mc.player.jump();
        }
    }
}
