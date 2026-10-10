package com.kubi.home.shortcut;

import dj.C36722g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.home.shortcut.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeMenuDisableHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/shortcut/HomeMenuDisableHelper;", "", "<init>", "()V", "DEPOSIT_URI", "", "isDepositDisabled", "", "uri", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeMenuDisableHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeMenuDisableHelper f26238a = new HomeMenuDisableHelper();

    /* JADX INFO: renamed from: a */
    public final boolean m30301a(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (StringsKt.contains$default((CharSequence) uri, (CharSequence) "?", false, 2, (Object) null)) {
            uri = StringsKt.slice(uri, RangesKt.until(0, StringsKt.indexOf$default((CharSequence) uri, "?", 0, false, 6, (Object) null)));
        }
        return Intrinsics.areEqual("account/deposit", uri) && C36722g.m82294h();
    }
}
