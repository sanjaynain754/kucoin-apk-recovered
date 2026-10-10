package com.kubi.host.core;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.utils.C27099x;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Inet4Monitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 \u00132\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/host/core/Inet4CfList;", "", "", "", "cfList", "<init>", "(Ljava/util/List;)V", "dnsList", "d", "(Ljava/util/List;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "ip", "e", "(Ljava/lang/String;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "b", "Lkotlin/Lazy;", "c", "()Ljava/util/List;", "binaryList", "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInet4Monitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Inet4Monitor.kt\ncom/kubi/host/core/Inet4CfList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1855#2,2:129\n*S KotlinDebug\n*F\n+ 1 Inet4Monitor.kt\ncom/kubi/host/core/Inet4CfList\n*L\n107#1:129,2\n*E\n"})
public final class Inet4CfList {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> cfList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy binaryList;

    /* JADX INFO: compiled from: Inet4Monitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/host/core/Inet4CfList$Companion;", "", "()V", "create", "Lcom/kubi/host/core/Inet4CfList;", "cfStr", "", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Inet4CfList create(@NotNull String cfStr) {
            Intrinsics.checkNotNullParameter(cfStr, "cfStr");
            return new Inet4CfList(StringsKt.split$default((CharSequence) cfStr, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null));
        }
    }

    public Inet4CfList(@NotNull List<String> cfList) {
        Intrinsics.checkNotNullParameter(cfList, "cfList");
        this.cfList = cfList;
        this.binaryList = LazyKt.lazy(new Function0<List<? extends String>>() { // from class: com.kubi.host.core.Inet4CfList$binaryList$2
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
                Inet4CfList inet4CfList = this.this$0;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (List list2 : arrayList2) {
                    String strSubstring = inet4CfList.m31386e((String) list2.get(0)).substring(0, Integer.parseInt((String) list2.get(1)));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList3.add(strSubstring);
                }
                return arrayList3;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m31384c() {
        return (List) this.binaryList.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m31385d(@NotNull List<String> dnsList) {
        Intrinsics.checkNotNullParameter(dnsList, "dnsList");
        for (String str : dnsList) {
            String strM31386e = m31386e(str);
            Iterator<String> it = m31384c().iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(strM31386e, it.next(), false, 2, (Object) null)) {
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m31386e(String ip2) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = StringsKt.split$default((CharSequence) ip2, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            String binaryString = Integer.toBinaryString(Integer.parseInt((String) it.next()));
            for (int length = 8 - binaryString.length(); length > 0; length--) {
                stringBuffer.append("0");
            }
            stringBuffer.append(binaryString);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …       }\n    }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return C27099x.m66919i(this.cfList, false, 2, null);
    }
}
