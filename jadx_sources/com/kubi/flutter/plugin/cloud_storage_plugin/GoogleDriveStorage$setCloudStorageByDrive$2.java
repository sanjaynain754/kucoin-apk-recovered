package com.kubi.flutter.plugin.cloud_storage_plugin;

import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: GoogleDriveStorage.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.plugin.cloud_storage_plugin.GoogleDriveStorage$setCloudStorageByDrive$2", m90122f = "GoogleDriveStorage.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class GoogleDriveStorage$setCloudStorageByDrive$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ C12632c $helper;
    final /* synthetic */ String $key;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ GoogleDriveStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDriveStorage$setCloudStorageByDrive$2(C12632c c12632c, GoogleDriveStorage googleDriveStorage, String str, String str2, Continuation<? super GoogleDriveStorage$setCloudStorageByDrive$2> continuation) {
        super(2, continuation);
        this.$helper = c12632c;
        this.this$0 = googleDriveStorage;
        this.$key = str;
        this.$value = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleDriveStorage$setCloudStorageByDrive$2(this.$helper, this.this$0, this.$key, this.$value, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((GoogleDriveStorage$setCloudStorageByDrive$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<File> listEmptyList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FileList fileListM23890a = this.$helper.m23890a();
            if (fileListM23890a != null) {
                listEmptyList = fileListM23890a.getFiles();
            } else {
                listEmptyList = null;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            boolean zM23892c = this.$helper.m23892c(this.this$0.m23882g(listEmptyList), this.this$0.m23883h(listEmptyList, this.$key), this.$key, this.$value);
            C44128b.m97265i("setCloudStorage, writeFileContent=" + zM23892c);
            return Boxing.boxBoolean(zM23892c);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
