package com.kubi.home.shortcut;

import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.home.shortcut.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ShortcutApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortcutApi;", "", "drawAllEncourage", "Lkotlinx/coroutines/flow/Flow;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ShortcutApi {
    @POST("v1/encouragement/draw-all")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<Object> m30402c();
}
