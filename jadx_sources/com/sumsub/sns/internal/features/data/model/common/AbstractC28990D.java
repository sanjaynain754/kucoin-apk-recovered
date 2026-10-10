package com.sumsub.sns.internal.features.data.model.common;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import tg0.C44960m;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public abstract class AbstractC28990D {

    @NotNull
    public static final C29177q Companion = new C29177q();

    /* JADX INFO: renamed from: a */
    public static final Lazy f58919a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.a4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC28990D.m69728b();
        }
    });

    public /* synthetic */ AbstractC28990D() {
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo69727c();

    public AbstractC28990D(int i11) {
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69728b() {
        return new C44960m("com.sumsub.sns.internal.features.data.model.common.ApplicantDataField", Reflection.getOrCreateKotlinClass(AbstractC28990D.class), new KClass[]{Reflection.getOrCreateKotlinClass(C29699u.class), Reflection.getOrCreateKotlinClass(C29719y.class)}, new InterfaceC44951d[]{C29182r.f59180a, C29704v.f59768a}, new Annotation[0]);
    }
}
