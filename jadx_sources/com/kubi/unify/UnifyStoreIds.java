package com.kubi.unify;

import com.kubi.unify.entity.BorrowConfigEntity;
import com.kubi.unify.entity.CDRConfigEntity;
import com.kubi.unify.entity.UnifiedLoanLeverageEntity;
import com.kubi.unify.entity.UnifyAccountStatusEntity;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import ir.C40167b;
import ir.InterfaceC40166a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.unify.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyStoreIds.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\bR'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\bR'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\bR!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\bR'\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001f\u0010\bR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b#\u0010\bR!\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0010\u001a\u0004\b'\u0010\b¨\u0006)"}, m90084d2 = {"Lcom/kubi/unify/UnifyStoreIds;", "", "<init>", "()V", "unifiedAccountStatus", "Lcom/kubi/utils/storage/StorageId;", "Lcom/kubi/unify/entity/UnifyAccountStatusEntity;", "getUnifiedAccountStatus", "()Lcom/kubi/utils/storage/StorageId;", "unifiedAccountStatus$delegate", "Lcom/kubi/network/api/utils/Link;", "unifiedMarginCDRCurrencies", "", "Lcom/kubi/unify/entity/CDRConfigEntity;", "getUnifiedMarginCDRCurrencies", "unifiedMarginCDRCurrencies$delegate", "Lkotlin/Lazy;", "unifiedLoanConfig", "Lcom/kubi/unify/entity/BorrowConfigEntity;", "getUnifiedLoanConfig", "unifiedLoanConfig$delegate", "unifiedUserLoanLeverageConfig", "Lcom/kubi/unify/entity/UnifiedLoanLeverageEntity;", "getUnifiedUserLoanLeverageConfig", "unifiedUserLoanLeverageConfig$delegate", "unifiedUnifyConfig", "Lcom/kubi/unify/entity/UnifyConfig;", "getUnifiedUnifyConfig", "unifiedUnifyConfig$delegate", "unifiedUnifyRiskLimit", "Lcom/kubi/unify/entity/UnifiedRiskLimitEntity;", "getUnifiedUnifyRiskLimit", "unifiedUnifyRiskLimit$delegate", "unifiedSortType", "", "getUnifiedSortType", "unifiedSortType$delegate", "unifiedHideSmall", "", "getUnifiedHideSmall", "unifiedHideSmall$delegate", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyStoreIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyStoreIds.kt\ncom/kubi/unify/UnifyStoreIds\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,89:1\n46#2:90\n46#2:91\n*S KotlinDebug\n*F\n+ 1 UnifyStoreIds.kt\ncom/kubi/unify/UnifyStoreIds\n*L\n27#1:90\n53#1:91\n*E\n"})
public final class UnifyStoreIds {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f53306b = {Reflection.property1(new PropertyReference1Impl(UnifyStoreIds.class, "unifiedAccountStatus", "getUnifiedAccountStatus()Lcom/kubi/utils/storage/StorageId;", 0)), Reflection.property1(new PropertyReference1Impl(UnifyStoreIds.class, "unifiedUserLoanLeverageConfig", "getUnifiedUserLoanLeverageConfig()Lcom/kubi/utils/storage/StorageId;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyStoreIds f53305a = new UnifyStoreIds();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC40166a f53307c = C40167b.m88525a(new Function0() { // from class: com.kubi.unify.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65239p();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f53308d = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65242s();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f53309e = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65241r();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC40166a f53310f = C40167b.m88525a(new Function0() { // from class: com.kubi.unify.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65246w();
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f53311g = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65244u();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f53312h = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65245v();
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Lazy f53313i = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65243t();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Lazy f53314j = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyStoreIds.m65240q();
        }
    });

    /* JADX INFO: renamed from: p */
    public static final StorageId m65239p() {
        StorageId storageId = new StorageId("unified", "account_status", StorageType.LocalSite, false, 8, null);
        String category = storageId.getCategory();
        storageId.getKey();
        return new StorageId(category, "account_status-" + UserInfo.a.i(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    /* JADX INFO: renamed from: q */
    public static final StorageId m65240q() {
        return new StorageId("unified", "unify_hide_small", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: r */
    public static final StorageId m65241r() {
        return new StorageId("unified", "unifiedLoanConfig", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: s */
    public static final StorageId m65242s() {
        return new StorageId("unified", "unifiedMarginCDRCurrencies", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: t */
    public static final StorageId m65243t() {
        return new StorageId("unified", "unify_sort_type", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: u */
    public static final StorageId m65244u() {
        return new StorageId("unified", "unify_config", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: v */
    public static final StorageId m65245v() {
        return new StorageId("unified", "unifiedUnifyRiskLimit", StorageType.LocalSite, false, 8, null);
    }

    /* JADX INFO: renamed from: w */
    public static final StorageId m65246w() {
        StorageId storageId = new StorageId("unified", "unifiedUserLoanConfig", StorageType.LocalSite, false, 8, null);
        String category = storageId.getCategory();
        storageId.getKey();
        return new StorageId(category, "unifiedUserLoanConfig-" + UserInfo.a.i(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<UnifyAccountStatusEntity> m65247i() {
        return (StorageId) f53307c.getValue(this, f53306b[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<Boolean> m65248j() {
        return (StorageId) f53314j.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<List<BorrowConfigEntity>> m65249k() {
        return (StorageId) f53309e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<List<CDRConfigEntity>> m65250l() {
        return (StorageId) f53308d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<String> m65251m() {
        return (StorageId) f53313i.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<UnifyConfig> m65252n() {
        return (StorageId) f53311g.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<List<UnifiedLoanLeverageEntity>> m65253o() {
        return (StorageId) f53310f.getValue(this, f53306b[1]);
    }
}
