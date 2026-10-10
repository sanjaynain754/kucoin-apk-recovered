package com.kubi.flutter.plugin.cloud_storage_plugin;

import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GoogleDriveStorage.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.plugin.cloud_storage_plugin.GoogleDriveStorage$getCloudStorageByDrive$2", m90122f = "GoogleDriveStorage.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGoogleDriveStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDriveStorage.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage$getCloudStorageByDrive$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class GoogleDriveStorage$getCloudStorageByDrive$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ C12632c $helper;
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ GoogleDriveStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDriveStorage$getCloudStorageByDrive$2(C12632c c12632c, GoogleDriveStorage googleDriveStorage, String str, Continuation<? super GoogleDriveStorage$getCloudStorageByDrive$2> continuation) {
        super(2, continuation);
        this.$helper = c12632c;
        this.this$0 = googleDriveStorage;
        this.$key = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleDriveStorage$getCloudStorageByDrive$2(this.$helper, this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((GoogleDriveStorage$getCloudStorageByDrive$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File fileM23883h;
        List<File> files;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FileList fileListM23890a = this.$helper.m23890a();
            String strM23891b = null;
            if (fileListM23890a != null && (files = fileListM23890a.getFiles()) != null) {
                fileM23883h = this.this$0.m23883h(files, this.$key);
            } else {
                fileM23883h = null;
            }
            if (fileM23883h != null) {
                C12632c c12632c = this.$helper;
                String id2 = fileM23883h.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                strM23891b = c12632c.m23891b(id2);
            }
            C44128b.m97265i("getCloudStorage");
            if (strM23891b == null) {
                return "";
            }
            return strM23891b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
