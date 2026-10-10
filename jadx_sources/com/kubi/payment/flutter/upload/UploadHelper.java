package com.kubi.payment.flutter.upload;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: compiled from: UploadHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u0010\u0010\nJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/flutter/upload/UploadHelper;", "", "<init>", "()V", "uploadFileList", "", "", "pathList", "businessType", "uploadFileList$PaymentLib_googleRelease", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "path", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFileListWithUri", "uriStringList", "uploadFileListWithUri$PaymentLib_googleRelease", "uriString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UploadHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UploadHelper f39536a = new UploadHelper();

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0086). Please report as a decompilation issue!!! */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m48220b(@NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super List<String>> continuation) {
        UploadHelper$uploadFileList$1 uploadHelper$uploadFileList$1;
        List arrayList;
        List<String> list2;
        Iterator<String> it;
        UploadHelper$uploadFileList$1 uploadHelper$uploadFileList$2;
        String str2;
        Object objM48219a;
        List list3;
        UploadHelper$uploadFileList$1 uploadHelper$uploadFileList$3;
        String str3;
        if (continuation instanceof UploadHelper$uploadFileList$1) {
            uploadHelper$uploadFileList$1 = (UploadHelper$uploadFileList$1) continuation;
            int i11 = uploadHelper$uploadFileList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uploadHelper$uploadFileList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                uploadHelper$uploadFileList$1 = new UploadHelper$uploadFileList$1(this, continuation);
            }
        } else {
            uploadHelper$uploadFileList$1 = new UploadHelper$uploadFileList$1(this, continuation);
        }
        Object obj = uploadHelper$uploadFileList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = uploadHelper$uploadFileList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            list2 = list;
            it = list.iterator();
            uploadHelper$uploadFileList$2 = uploadHelper$uploadFileList$1;
            str2 = str;
            if (it.hasNext()) {
                return arrayList;
            }
            String next = it.next();
            uploadHelper$uploadFileList$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
            uploadHelper$uploadFileList$2.L$1 = str2;
            uploadHelper$uploadFileList$2.L$2 = arrayList;
            uploadHelper$uploadFileList$2.L$3 = it;
            uploadHelper$uploadFileList$2.L$4 = SpillingKt.nullOutSpilledVariable(next);
            uploadHelper$uploadFileList$2.label = 1;
            objM48219a = m48219a(next, str2, uploadHelper$uploadFileList$2);
            if (objM48219a == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str4 = str2;
            list3 = arrayList;
            obj = objM48219a;
            uploadHelper$uploadFileList$3 = uploadHelper$uploadFileList$2;
            str3 = str4;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) uploadHelper$uploadFileList$1.L$3;
            List list4 = (List) uploadHelper$uploadFileList$1.L$2;
            str3 = (String) uploadHelper$uploadFileList$1.L$1;
            List<String> list5 = (List) uploadHelper$uploadFileList$1.L$0;
            ResultKt.throwOnFailure(obj);
            UploadHelper$uploadFileList$1 uploadHelper$uploadFileList$4 = uploadHelper$uploadFileList$1;
            list3 = list4;
            list2 = list5;
            uploadHelper$uploadFileList$3 = uploadHelper$uploadFileList$4;
        }
        String str5 = (String) obj;
        if (str5 != null || str5.length() == 0) {
            list3.clear();
            return null;
        }
        list3.add(str5);
        arrayList = list3;
        str2 = str3;
        uploadHelper$uploadFileList$2 = uploadHelper$uploadFileList$3;
        if (it.hasNext()) {
            return arrayList;
        }
        String next2 = it.next();
        uploadHelper$uploadFileList$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
        uploadHelper$uploadFileList$2.L$1 = str2;
        uploadHelper$uploadFileList$2.L$2 = arrayList;
        uploadHelper$uploadFileList$2.L$3 = it;
        uploadHelper$uploadFileList$2.L$4 = SpillingKt.nullOutSpilledVariable(next2);
        uploadHelper$uploadFileList$2.label = 1;
        objM48219a = m48219a(next2, str2, uploadHelper$uploadFileList$2);
        if (objM48219a == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str6 = str2;
        list3 = arrayList;
        obj = objM48219a;
        uploadHelper$uploadFileList$3 = uploadHelper$uploadFileList$2;
        str3 = str6;
        String str7 = (String) obj;
        if (str7 != null) {
        }
        list3.clear();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0086). Please report as a decompilation issue!!! */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m48222d(@NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super List<String>> continuation) {
        UploadHelper$uploadFileListWithUri$1 uploadHelper$uploadFileListWithUri$1;
        List arrayList;
        List<String> list2;
        Iterator<String> it;
        UploadHelper$uploadFileListWithUri$1 uploadHelper$uploadFileListWithUri$2;
        String str2;
        Object objM48221c;
        List list3;
        UploadHelper$uploadFileListWithUri$1 uploadHelper$uploadFileListWithUri$3;
        String str3;
        if (continuation instanceof UploadHelper$uploadFileListWithUri$1) {
            uploadHelper$uploadFileListWithUri$1 = (UploadHelper$uploadFileListWithUri$1) continuation;
            int i11 = uploadHelper$uploadFileListWithUri$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uploadHelper$uploadFileListWithUri$1.label = i11 - Integer.MIN_VALUE;
            } else {
                uploadHelper$uploadFileListWithUri$1 = new UploadHelper$uploadFileListWithUri$1(this, continuation);
            }
        } else {
            uploadHelper$uploadFileListWithUri$1 = new UploadHelper$uploadFileListWithUri$1(this, continuation);
        }
        Object obj = uploadHelper$uploadFileListWithUri$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = uploadHelper$uploadFileListWithUri$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            list2 = list;
            it = list.iterator();
            uploadHelper$uploadFileListWithUri$2 = uploadHelper$uploadFileListWithUri$1;
            str2 = str;
            if (it.hasNext()) {
                return arrayList;
            }
            String next = it.next();
            uploadHelper$uploadFileListWithUri$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
            uploadHelper$uploadFileListWithUri$2.L$1 = str2;
            uploadHelper$uploadFileListWithUri$2.L$2 = arrayList;
            uploadHelper$uploadFileListWithUri$2.L$3 = it;
            uploadHelper$uploadFileListWithUri$2.L$4 = SpillingKt.nullOutSpilledVariable(next);
            uploadHelper$uploadFileListWithUri$2.label = 1;
            objM48221c = m48221c(next, str2, uploadHelper$uploadFileListWithUri$2);
            if (objM48221c == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str4 = str2;
            list3 = arrayList;
            obj = objM48221c;
            uploadHelper$uploadFileListWithUri$3 = uploadHelper$uploadFileListWithUri$2;
            str3 = str4;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) uploadHelper$uploadFileListWithUri$1.L$3;
            List list4 = (List) uploadHelper$uploadFileListWithUri$1.L$2;
            str3 = (String) uploadHelper$uploadFileListWithUri$1.L$1;
            List<String> list5 = (List) uploadHelper$uploadFileListWithUri$1.L$0;
            ResultKt.throwOnFailure(obj);
            UploadHelper$uploadFileListWithUri$1 uploadHelper$uploadFileListWithUri$4 = uploadHelper$uploadFileListWithUri$1;
            list3 = list4;
            list2 = list5;
            uploadHelper$uploadFileListWithUri$3 = uploadHelper$uploadFileListWithUri$4;
        }
        String str5 = (String) obj;
        if (str5 != null || str5.length() == 0) {
            list3.clear();
            return null;
        }
        list3.add(str5);
        arrayList = list3;
        str2 = str3;
        uploadHelper$uploadFileListWithUri$2 = uploadHelper$uploadFileListWithUri$3;
        if (it.hasNext()) {
            return arrayList;
        }
        String next2 = it.next();
        uploadHelper$uploadFileListWithUri$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
        uploadHelper$uploadFileListWithUri$2.L$1 = str2;
        uploadHelper$uploadFileListWithUri$2.L$2 = arrayList;
        uploadHelper$uploadFileListWithUri$2.L$3 = it;
        uploadHelper$uploadFileListWithUri$2.L$4 = SpillingKt.nullOutSpilledVariable(next2);
        uploadHelper$uploadFileListWithUri$2.label = 1;
        objM48221c = m48221c(next2, str2, uploadHelper$uploadFileListWithUri$2);
        if (objM48221c == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str6 = str2;
        list3 = arrayList;
        obj = objM48221c;
        uploadHelper$uploadFileListWithUri$3 = uploadHelper$uploadFileListWithUri$2;
        str3 = str6;
        String str7 = (String) obj;
        if (str7 != null) {
        }
        list3.clear();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Object m48219a(String str, String str2, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new UploadHelper$uploadFile$2(str, str2, null), continuation);
    }

    /* JADX INFO: renamed from: c */
    public final Object m48221c(String str, String str2, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new UploadHelper$uploadFileListWithUri$3(str, str2, null), continuation);
    }
}
