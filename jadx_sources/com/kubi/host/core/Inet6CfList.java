package com.kubi.host.core;

import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Inet6Monitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m90084d2 = {"Lcom/kubi/host/core/Inet6CfList;", "", "", "", "cfList", "<init>", "(Ljava/util/List;)V", "dnsList", "e", "(Ljava/util/List;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "ip", "f", "(Ljava/lang/String;)Ljava/lang/String;", "g", "i", CmcdData.Factory.STREAMING_FORMAT_HLS, "binary", "", SessionDescription.ATTR_LENGTH, "Ljava/lang/StringBuffer;", "c", "(Ljava/lang/String;I)Ljava/lang/StringBuffer;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "b", "Lkotlin/Lazy;", "d", "()Ljava/util/List;", "binaryList", "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Inet6CfList {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> cfList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy binaryList;

    /* JADX INFO: compiled from: Inet6Monitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/host/core/Inet6CfList$Companion;", "", "()V", "create", "Lcom/kubi/host/core/Inet6CfList;", "cfStr", "", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Inet6CfList create(@NotNull String cfStr) {
            Intrinsics.checkNotNullParameter(cfStr, "cfStr");
            return new Inet6CfList(StringsKt.split$default((CharSequence) cfStr, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null));
        }
    }

    public Inet6CfList(@NotNull List<String> cfList) {
        Intrinsics.checkNotNullParameter(cfList, "cfList");
        this.cfList = cfList;
        this.binaryList = LazyKt.lazy(new Function0<List<? extends String>>() { // from class: com.kubi.host.core.Inet6CfList$binaryList$2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends String> invoke() {
                List list = this.this$0.cfList;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!TextUtils.isEmpty((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<List> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(StringsKt.split$default((CharSequence) it.next(), new String[]{"/"}, false, 0, 6, (Object) null));
                }
                Inet6CfList inet6CfList = this.this$0;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (List list2 : arrayList2) {
                    String strSubstring = inet6CfList.m31392f((String) list2.get(0)).substring(0, Integer.parseInt((String) list2.get(1)));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList3.add(strSubstring);
                }
                return arrayList3;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final StringBuffer m31389c(String binary, int length) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int length2 = length - binary.length(); length2 > 0; length2--) {
            stringBuffer.append("0");
        }
        stringBuffer.append(binary);
        return stringBuffer;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m31390d() {
        return (List) this.binaryList.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m31391e(@NotNull List<String> dnsList) {
        Intrinsics.checkNotNullParameter(dnsList, "dnsList");
        for (String str : dnsList) {
            String strM31392f = m31392f(str);
            Iterator<String> it = m31390d().iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(strM31392f, it.next(), false, 2, (Object) null)) {
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m31392f(String ip2) {
        if (StringsKt.contains$default((CharSequence) ip2, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
            return m31394h(ip2);
        }
        return StringsKt.contains$default((CharSequence) ip2, (CharSequence) "::", false, 2, (Object) null) ? m31395i(ip2) : m31393g(ip2);
    }

    /* JADX INFO: renamed from: g */
    public final String m31393g(String ip2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : StringsKt.split$default((CharSequence) ip2, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null)) {
            Integer numValueOf = TextUtils.isEmpty(str) ? Integer.valueOf("0", 16) : Integer.valueOf(str, 16);
            Intrinsics.checkNotNullExpressionValue(numValueOf, "if (TextUtils.isEmpty(sn…et, 16)\n                }");
            String value = Integer.toBinaryString(numValueOf.intValue());
            Intrinsics.checkNotNullExpressionValue(value, "value");
            stringBuffer.append(m31389c(value, 16));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public final String m31394h(String ip2) {
        StringBuffer stringBuffer = new StringBuffer();
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) ip2, C33844oi.f71346o, 0, false, 6, (Object) null);
        String strSubstring = ip2.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstring, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        String strSubstring2 = ip2.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        stringBuffer.append(strSubstring2);
        stringBuffer.append(C33844oi.f71346o);
        String hexString = Integer.toHexString(Integer.parseInt((String) listSplit$default.get(0)));
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(ipv4List[0].toInt())");
        stringBuffer.append(m31389c(hexString, 2));
        String hexString2 = Integer.toHexString(Integer.parseInt((String) listSplit$default.get(1)));
        Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(ipv4List[1].toInt())");
        stringBuffer.append(m31389c(hexString2, 2));
        stringBuffer.append(C33844oi.f71346o);
        String hexString3 = Integer.toHexString(Integer.parseInt((String) listSplit$default.get(2)));
        Intrinsics.checkNotNullExpressionValue(hexString3, "toHexString(ipv4List[2].toInt())");
        stringBuffer.append(m31389c(hexString3, 2));
        String hexString4 = Integer.toHexString(Integer.parseInt((String) listSplit$default.get(3)));
        Intrinsics.checkNotNullExpressionValue(hexString4, "toHexString(ipv4List[3].toInt())");
        stringBuffer.append(m31389c(hexString4, 2));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        if (StringsKt.contains$default((CharSequence) string, (CharSequence) "::", false, 2, (Object) null)) {
            String string2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "buffer.toString()");
            return m31395i(string2);
        }
        String string3 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "buffer.toString()");
        return m31393g(string3);
    }

    /* JADX INFO: renamed from: i */
    public final String m31395i(String ip2) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        List listSplit$default = StringsKt.split$default((CharSequence) ip2, new String[]{"::"}, false, 0, 6, (Object) null);
        String str2 = TextUtils.isEmpty((CharSequence) listSplit$default.get(0)) ? "0000" : (String) listSplit$default.get(0);
        int size = 1;
        String str3 = TextUtils.isEmpty((CharSequence) listSplit$default.get(1)) ? "0000" : (String) listSplit$default.get(1);
        int size2 = StringsKt.contains$default((CharSequence) str2, (CharSequence) C33844oi.f71346o, false, 2, (Object) null) ? StringsKt.split$default((CharSequence) str2, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null).size() : 1;
        if (StringsKt.contains$default((CharSequence) str3, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
            str = str3;
            size = StringsKt.split$default((CharSequence) str, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null).size();
        } else {
            str = str3;
        }
        stringBuffer.append(str2);
        for (int i11 = (8 - size2) - size; i11 > 0; i11--) {
            stringBuffer.append(C33844oi.f71346o);
            stringBuffer.append("0000");
        }
        stringBuffer.append(C33844oi.f71346o);
        stringBuffer.append(str);
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return m31393g(string);
    }

    @NotNull
    public String toString() {
        return C27099x.m66919i(this.cfList, false, 2, null);
    }
}
