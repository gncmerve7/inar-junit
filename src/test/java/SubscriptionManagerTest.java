package test.java;

/*Test Case 1: FREE tier, EMAIL notifications, ENABLED auto-renewal.
Test Case 2: STANDARD tier, SMS notifications, DISABLED auto-renewal.
Test Case 3: PREMIUM tier, NONE notifications, ENABLED auto-renewal.
Test Case 4: FREE tier, SMS notifications, DISABLED auto-renewal.
Test Case 5: STANDARD tier, EMAIL notifications, ENABLED auto-renewal.
Test Case 6: PREMIUM tier, SMS notifications, DISABLED auto-renewal.*/

import main.java.SubscriptionManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {
    SubscriptionManager manager = new SubscriptionManager();

    @Test
    public void freeTierEmailNotificationsEnabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED", subscriptionType);
    }

    @Test
    public void standardTierSmsNotificationsDisabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED", subscriptionType);
    }

    @Test
    public void PremiumTierNoneNotificationsEnabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED", subscriptionType);
    }

    @Test
    public void freeTierSmsNotificationsDisabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED", subscriptionType);
    }

    @Test
    public void standardTierEmailNotificationsEnabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED", subscriptionType);
    }

    @Test
    public void premiumTierSmsNotificationsDisabledAutoRenewalTest() {
        String subscriptionType = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED", subscriptionType);
    }
}
