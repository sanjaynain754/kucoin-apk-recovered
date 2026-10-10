package com.sumsub.sns.internal.core.domain;

import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28580i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty[] f58190a = {AbstractC28118g.m69077a(AbstractC28580i.class, "tokenDataStore", "getTokenDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* JADX INFO: renamed from: b */
    public static final ReadOnlyProperty f58191b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("token_store", null, null, null, 14, null);
}
