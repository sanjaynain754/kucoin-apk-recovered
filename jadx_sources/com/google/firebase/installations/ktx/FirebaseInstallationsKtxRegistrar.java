package com.google.firebase.installations.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Installations.kt */
/* JADX INFO: loaded from: classes56.dex */
@Deprecated(message = "com.google.firebase.installations.FirebaseInstallationsKtxRegistrar has been deprecated. Use `com.google.firebase.installationsFirebaseInstallationsKtxRegistrar` instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/google/firebase/installations/ktx/FirebaseInstallationsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-installations"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        return CollectionsKt.emptyList();
    }
}
