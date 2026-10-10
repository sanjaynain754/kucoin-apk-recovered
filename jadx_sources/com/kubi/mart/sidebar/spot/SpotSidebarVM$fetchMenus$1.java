package com.kubi.mart.sidebar.spot;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SpotSidebarVM.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.SpotSidebarVM", m90122f = "SpotSidebarVM.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, m90124l = {43, 50, 58}, m90125m = "fetchMenus", m90126n = {"sidebarType", "symbolCode", "sidebarType", "symbolCode", "entityFlow", "sidebarType", "symbolCode", "entityFlow", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "favModel", "menus", "it", "$i$a$-let-SpotSidebarVM$fetchMenus$favorDataList$2"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
public final class SpotSidebarVM$fetchMenus$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotSidebarVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSidebarVM$fetchMenus$1(SpotSidebarVM spotSidebarVM, Continuation<? super SpotSidebarVM$fetchMenus$1> continuation) {
        super(continuation);
        this.this$0 = spotSidebarVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41439f(null, null, this);
    }
}
