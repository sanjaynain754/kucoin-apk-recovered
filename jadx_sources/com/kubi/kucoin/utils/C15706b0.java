package com.kubi.kucoin.utils;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.b0 */
/* JADX INFO: compiled from: EmulatorHelper.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, m90084d2 = {"formatEmulatorDeviceInfo", "", C33820nf.f71125D, "model", "LAppFacade_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmulatorHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmulatorHelper.kt\ncom/kubi/kucoin/utils/EmulatorHelperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class C15706b0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m33132a(@Nullable String str, @Nullable String str2) {
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"Device info", "brand: " + m33133b(str), "model: " + m33133b(str2)}), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: b */
    public static final String m33133b(String str) {
        if (str == null) {
            return "unknown";
        }
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        return str == null ? "unknown" : str;
    }
}
