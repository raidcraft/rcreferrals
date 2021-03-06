package de.raidcraft.referrals.events;

import de.raidcraft.referrals.entities.Referral;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class PlayerReferredEvent extends RCReferralEvent {
    @Getter
    private static final HandlerList handlerList = new HandlerList();

    private final Referral referral;

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
