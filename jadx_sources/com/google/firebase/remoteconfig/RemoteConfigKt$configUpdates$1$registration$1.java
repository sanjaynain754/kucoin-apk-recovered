package com.google.firebase.remoteconfig;

import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.channels.C41570i;
import kotlinx.coroutines.channels.InterfaceC41574m;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "onUpdate", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "com.google.firebase-firebase-config"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ InterfaceC41574m<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, InterfaceC41574m<? super ConfigUpdate> interfaceC41574m) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = interfaceC41574m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$0(InterfaceC41574m $this$callbackFlow, ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter($this$callbackFlow, "$$this$callbackFlow");
        Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
        C41570i.m90707b($this$callbackFlow, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(@NotNull FirebaseRemoteConfigException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C41713n0.m91127c(this.$$this$callbackFlow, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(@NotNull final ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        final InterfaceC41574m<ConfigUpdate> interfaceC41574m = this.$$this$callbackFlow;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.o
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.onUpdate$lambda$0(interfaceC41574m, configUpdate);
            }
        });
    }
}
