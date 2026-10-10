package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String TAG = Logger.tagWithPrefix("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void updateAll(Context context, List<WorkSpec> list) {
        boolean z11;
        Iterator<WorkSpec> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z12 = false;
        while (it.hasNext()) {
            Constraints constraints = it.next().constraints;
            requiresBatteryNotLow |= constraints.getRequiresBatteryNotLow();
            requiresCharging |= constraints.getRequiresCharging();
            requiresStorageNotLow |= constraints.getRequiresStorageNotLow();
            if (constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 |= z11;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z12) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z12));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.get().debug(TAG, "onReceive : " + intent);
        context.startService(CommandHandler.createConstraintsChangedIntent(context));
    }
}
