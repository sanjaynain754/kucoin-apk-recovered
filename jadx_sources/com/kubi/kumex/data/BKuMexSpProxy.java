package com.kubi.kumex.data;

import android.content.SharedPreferences;
import com.kubi.kumex.data.BKuMexSpProxy;
import com.kubi.utils.DataMapUtil;
import org.jetbrains.annotations.NotNull;
import p440lx.SharedPreferencesC42328a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BKuMexSpProxy.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexSpProxy;", "Lcom/kubi/restful/sp/SpProxy;", "sp", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BKuMexSpProxy extends SharedPreferencesC42328a {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f28816c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<BKuMexSpProxy> f28817d = LazyKt.lazy(new Function0() { // from class: zl.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BKuMexSpProxy.m33333k();
        }
    });

    /* JADX INFO: compiled from: BKuMexSpProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexSpProxy$Companion;", "", "<init>", "()V", "sp", "Lcom/kubi/kumex/data/BKuMexSpProxy;", "getSp", "()Lcom/kubi/kumex/data/BKuMexSpProxy;", "sp$delegate", "Lkotlin/Lazy;", "getInstance", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final BKuMexSpProxy m33334a() {
            return (BKuMexSpProxy) BKuMexSpProxy.f28817d.getValue();
        }

        @NotNull
        public final BKuMexSpProxy getInstance() {
            return m33334a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKuMexSpProxy(@NotNull SharedPreferences sp2) {
        super(sp2);
        Intrinsics.checkNotNullParameter(sp2, "sp");
    }

    /* JADX INFO: renamed from: k */
    public static final BKuMexSpProxy m33333k() {
        return new BKuMexSpProxy(DataMapUtil.f54245a.m66374h("BKuMex"));
    }
}
