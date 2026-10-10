package com.kubi.quotefacade.helper;

import com.google.gson.Gson;
import com.kubi.quotefacade.entity.ComplianceFinanceRuleEntity;
import com.tencent.mmkv.MMKV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.g2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteBusinessConfigMMKV.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteBusinessConfigMMKV;", "", "<init>", "()V", "MMKV_ID", "", "KEY_CONFIG", "KEY_INCLUDES", "KEY_EXCLUDES", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getMmkv", "()Lcom/tencent/mmkv/MMKV;", "mmkv$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "saveConfig", "", "config", "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;", "getConfig", "saveIncludes", "includes", "getIncludes", "saveExcludes", "excludes", "getExcludes", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteBusinessConfigMMKV {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QuoteBusinessConfigMMKV f41982a = new QuoteBusinessConfigMMKV();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f41983b = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.f2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteBusinessConfigMMKV.m51917d();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Gson f41984c = new Gson();

    /* JADX INFO: renamed from: d */
    public static final MMKV m51917d() {
        MMKV mmkvMmkvWithID = MMKV.mmkvWithID("quote_business_config");
        Intrinsics.checkNotNullExpressionValue(mmkvMmkvWithID, "mmkvWithID(...)");
        return mmkvMmkvWithID;
    }

    /* JADX INFO: renamed from: c */
    public final MMKV m51919c() {
        return (MMKV) f41983b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ComplianceFinanceRuleEntity m51918b() {
        String string = m51919c().getString("business_config", null);
        if (string == null || string.length() == 0) {
            return null;
        }
        return (ComplianceFinanceRuleEntity) f41984c.fromJson(string, ComplianceFinanceRuleEntity.class);
    }

    /* JADX INFO: renamed from: e */
    public final void m51920e(@Nullable ComplianceFinanceRuleEntity complianceFinanceRuleEntity) {
        m51919c().putString("business_config", f41984c.toJson(complianceFinanceRuleEntity));
    }
}
