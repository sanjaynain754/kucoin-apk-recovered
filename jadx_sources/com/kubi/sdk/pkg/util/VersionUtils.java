package com.kubi.sdk.pkg.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5264d;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import p852kotlin.text.UStringsKt;

/* JADX INFO: compiled from: VersionUtils.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/VersionUtils;", "", "<init>", "()V", "", "version", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "version1", "version2", "", "b", "(Ljava/lang/String;Ljava/lang/String;)I", "", "Lkotlin/UInt;", "c", "(Ljava/lang/String;)[Lkotlin/UInt;", "Lkotlin/Lazy;", "d", "()Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVersionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionUtils.kt\ncom/kubi/sdk/pkg/util/VersionUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,77:1\n37#2,2:78\n37#2,2:81\n37#2,2:87\n26#3:80\n11335#4:83\n11670#4,3:84\n*S KotlinDebug\n*F\n+ 1 VersionUtils.kt\ncom/kubi/sdk/pkg/util/VersionUtils\n*L\n29#1:78,2\n35#1:81,2\n39#1:87,2\n34#1:80\n37#1:83\n37#1:84,3\n*E\n"})
public final class VersionUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final VersionUtils f47483a = new VersionUtils();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy appVersion = LazyKt.lazy(new Function0<String>() { // from class: com.kubi.sdk.pkg.util.VersionUtils$appVersion$2
        @Override // p852kotlin.jvm.functions.Function0
        public final String invoke() {
            String appVersion2 = C5264d.m6166l();
            Intrinsics.checkNotNullExpressionValue(appVersion2, "appVersion");
            return StringsKt.contains$default((CharSequence) appVersion2, (CharSequence) C33820nf.f71144W, false, 2, (Object) null) ? (String) CollectionsKt.first(StringsKt.split$default((CharSequence) appVersion2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) : appVersion2;
        }
    });

    /* JADX INFO: renamed from: a */
    public final boolean m57850a(@Nullable String version) {
        return (version == null || version.length() == 0 || new Regex("\\.").split(version, 0).toArray(new String[0]).length != 3) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final int m57851b(@Nullable String version1, @Nullable String version2) {
        if ((version1 == null || version1.length() == 0) && (version2 == null || version2.length() == 0)) {
            return 0;
        }
        if (version1 == null || version1.length() == 0) {
            return -1;
        }
        if (version2 == null || version2.length() == 0) {
            return 1;
        }
        UInt[] uIntArrM57852c = m57852c(version1);
        UInt[] uIntArrM57852c2 = m57852c(version2);
        int iMin = Math.min(uIntArrM57852c.length, uIntArrM57852c2.length);
        int iCompare = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            iCompare = Integer.compare(uIntArrM57852c[i11].getData() ^ Integer.MIN_VALUE, uIntArrM57852c2[i11].getData() ^ Integer.MIN_VALUE);
            if (iCompare != 0) {
                break;
            }
        }
        return iCompare != 0 ? iCompare : Intrinsics.compare(uIntArrM57852c.length, uIntArrM57852c2.length);
    }

    /* JADX INFO: renamed from: c */
    public final UInt[] m57852c(String str) {
        String str2 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null));
        if (str2 == null) {
            return new UInt[0];
        }
        String[] strArr = (String[]) StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str3 : strArr) {
            UInt uIntOrNull = UStringsKt.toUIntOrNull(str3);
            arrayList.add(UInt.m103933boximpl(uIntOrNull != null ? uIntOrNull.getData() : 0));
        }
        return (UInt[]) arrayList.toArray(new UInt[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m57853d() {
        Object value = appVersion.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-appVersion>(...)");
        return (String) value;
    }
}
