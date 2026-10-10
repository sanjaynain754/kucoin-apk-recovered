package com.reactnativecommunity.webview;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: RNCWebViewManagerImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"invalidCharRegex", "Lkotlin/text/Regex;", "getInvalidCharRegex", "()Lkotlin/text/Regex;", "react-native-webview_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNCWebViewManagerImplKt {

    @NotNull
    private static final Regex invalidCharRegex = new Regex("[\\\\/%\"]");

    @NotNull
    public static final Regex getInvalidCharRegex() {
        return invalidCharRegex;
    }
}
