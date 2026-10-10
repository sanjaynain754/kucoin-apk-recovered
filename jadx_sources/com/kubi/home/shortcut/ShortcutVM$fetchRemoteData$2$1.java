package com.kubi.home.shortcut;

import com.google.gson.JsonObject;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ShortcutVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/google/gson/JsonObject;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.shortcut.ShortcutVM$fetchRemoteData$2$1", m90122f = "ShortcutVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nShortcutVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutVM.kt\ncom/kubi/home/shortcut/ShortcutVM$fetchRemoteData$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
public final class ShortcutVM$fetchRemoteData$2$1 extends SuspendLambda implements Function2<JsonObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortcutVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(JsonObject jsonObject, Continuation<? super Unit> continuation) {
        return ((ShortcutVM$fetchRemoteData$2$1) create(jsonObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutVM$fetchRemoteData$2$1(ShortcutVM shortcutVM, Continuation<? super ShortcutVM$fetchRemoteData$2$1> continuation) {
        super(2, continuation);
        this.this$0 = shortcutVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortcutVM$fetchRemoteData$2$1 shortcutVM$fetchRemoteData$2$1 = new ShortcutVM$fetchRemoteData$2$1(this.this$0, continuation);
        shortcutVM$fetchRemoteData$2$1.L$0 = obj;
        return shortcutVM$fetchRemoteData$2$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsonObject jsonObject = (JsonObject) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (jsonObject != null) {
            ShortcutVM shortcutVM = this.this$0;
            ShortcutResponse data = ((ShortcutData) C27099x.m66913c(C27029c.m66606i(jsonObject), ShortcutData.class)).getData();
            if (data != null) {
                shortcutVM.m30298r(data);
            }
        }
        return Unit.INSTANCE;
    }
}
