package com.kubi.assets.dialog.payment;

import com.kubi.assets.AssetStorageIds;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.dialog.payment.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetPaymentLastUseHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetPaymentLastUseHelper;", "", "<init>", "()V", "VALID_DURATION_MILLIS", "", "saveLastUse", "", "tradeType", "", "paymentMethodCode", "getLastUseCode", "isLastUse", "", "clearLastUse", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetPaymentLastUseHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetPaymentLastUseHelper.kt\ncom/kubi/assets/dialog/payment/AssetPaymentLastUseHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n23#2,2:79\n75#2,2:81\n84#2:83\n32#2:84\n15#2:86\n15#2:87\n1#3:85\n*S KotlinDebug\n*F\n+ 1 AssetPaymentLastUseHelper.kt\ncom/kubi/assets/dialog/payment/AssetPaymentLastUseHelper\n*L\n29#1:79,2\n30#1:81,2\n41#1:83\n52#1:84\n74#1:86\n75#1:87\n*E\n"})
public final class AssetPaymentLastUseHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetPaymentLastUseHelper f17185a = new AssetPaymentLastUseHelper();

    /* JADX INFO: renamed from: b */
    public static final long f17186b = TimeUnit.DAYS.toMillis(30);

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m16376b(@Nullable String str) {
        if (str != null && str.length() != 0) {
            AssetStorageIds assetStorageIds = AssetStorageIds.f16425a;
            long jM102324f = C46392a.m102324f(assetStorageIds.m15245g(str), 0L);
            if (jM102324f == 0) {
                return null;
            }
            if (System.currentTimeMillis() - jM102324f > f17186b) {
                m16375a(str);
                return null;
            }
            String strM102326h = C46392a.m102326h(assetStorageIds.m15244f(str), "");
            if (strM102326h.length() > 0) {
                return strM102326h;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m16375a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        AssetStorageIds assetStorageIds = AssetStorageIds.f16425a;
        C46392a.m102335r(assetStorageIds.m15244f(str));
        C46392a.m102335r(assetStorageIds.m15245g(str));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16377c(@Nullable String str, @Nullable String str2) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        return Intrinsics.areEqual(m16376b(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m16378d(@Nullable String str, @Nullable String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        AssetStorageIds assetStorageIds = AssetStorageIds.f16425a;
        C46392a.m102333p(assetStorageIds.m15244f(str), str2);
        C46392a.m102330m(assetStorageIds.m15245g(str), System.currentTimeMillis());
    }
}
