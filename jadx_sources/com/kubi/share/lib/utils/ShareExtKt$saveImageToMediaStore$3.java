package com.kubi.share.lib.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentActivity;
import com.kubi.share.R$string;
import com.kubi.utils.ToastCompat;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import java.io.OutputStream;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3", m90122f = "ShareExt.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3}, m90124l = {259, TPReportParams.LIVE_STEP_PLAY, 271, 277}, m90125m = "invokeSuspend", m90126n = {"fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "outputStream", "fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "outputStream", "fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "e"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"})
@SourceDebugExtension({"SMAP\nShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$saveImageToMediaStore$3\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,391:1\n45#2,4:392\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$saveImageToMediaStore$3\n*L\n276#1:392,4\n*E\n"})
public final class ShareExtKt$saveImageToMediaStore$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ FragmentActivity $context;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$1 */
    /* JADX INFO: compiled from: ShareExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$1", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246261 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C246261(FragmentActivity fragmentActivity, Continuation<? super C246261> continuation) {
            super(2, continuation);
            this.$context = fragmentActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C246261(this.$context, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C246261) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.$context.getString(R$string.save_success), new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$2 */
    /* JADX INFO: compiled from: ShareExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$2", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246272 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C246272(FragmentActivity fragmentActivity, Continuation<? super C246272> continuation) {
            super(2, continuation);
            this.$context = fragmentActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C246272(this.$context, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C246272) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.$context.getString(R$string.failed), new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$3 */
    /* JADX INFO: compiled from: ShareExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$3", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246283 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C246283(FragmentActivity fragmentActivity, Continuation<? super C246283> continuation) {
            super(2, continuation);
            this.$context = fragmentActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C246283(this.$context, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C246283) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.$context.getString(R$string.failed), new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$4 */
    /* JADX INFO: compiled from: ShareExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$saveImageToMediaStore$3$4", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246294 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C246294(FragmentActivity fragmentActivity, Continuation<? super C246294> continuation) {
            super(2, continuation);
            this.$context = fragmentActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C246294(this.$context, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C246294) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.$context.getString(R$string.failed), new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareExtKt$saveImageToMediaStore$3(FragmentActivity fragmentActivity, Bitmap bitmap, Continuation<? super ShareExtKt$saveImageToMediaStore$3> continuation) {
        super(2, continuation);
        this.$context = fragmentActivity;
        this.$bitmap = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareExtKt$saveImageToMediaStore$3(this.$context, this.$bitmap, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareExtKt$saveImageToMediaStore$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0192 A[Catch: Exception -> 0x0045, TRY_ENTER, TryCatch #2 {Exception -> 0x0045, blocks: (B:12:0x0040, B:45:0x0192, B:49:0x019a, B:50:0x019d, B:23:0x008e, B:26:0x00c1, B:27:0x00e0, B:29:0x00e8, B:31:0x00f1, B:51:0x019e, B:30:0x00ef), top: B:64:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018c, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r6, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d3, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r5, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0205, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r4, r16) == r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        ?? r11 = 3;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = "share_" + System.currentTimeMillis() + ".jpg";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 29) {
                        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/KuCoin");
                        contentValues.put("is_pending", Boxing.boxInt(1));
                    }
                    ContentResolver contentResolver = this.$context.getContentResolver();
                    Uri contentUri = i12 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    Uri uriInsert = contentResolver.insert(contentUri, contentValues);
                    if (uriInsert != null) {
                        try {
                            outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream != null) {
                                this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
                                outputStreamOpenOutputStream.flush();
                                if (i12 >= 29) {
                                    contentValues.clear();
                                    contentValues.put("is_pending", Boxing.boxInt(0));
                                    contentResolver.update(uriInsert, contentValues, null, null);
                                }
                                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                                C246261 c246261 = new C246261(this.$context, null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                                this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                                this.L$6 = outputStreamOpenOutputStream;
                                this.label = 1;
                                if (C41686h.m91049g(abstractC41697j0M94121c, c246261, this) == coroutine_suspended) {
                                }
                                if (outputStreamOpenOutputStream != null) {
                                    outputStreamOpenOutputStream.close();
                                }
                            } else {
                                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                                C246272 c246272 = new C246272(this.$context, null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                                this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                                this.L$6 = outputStreamOpenOutputStream;
                                this.label = 2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = 0;
                            if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                    } else {
                        AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
                        C246283 c246283 = new C246283(this.$context, null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                        this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1 || i11 == 2) {
                    outputStreamOpenOutputStream = (OutputStream) this.L$6;
                    ResultKt.throwOnFailure(obj);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                } else if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C46646a.m102888b(e11, "ShareExt");
            }
            AbstractC41697j0 abstractC41697j0M94121c4 = C42911a.m94121c();
            C246294 c246294 = new C246294(this.$context, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(e11);
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 4;
        }
        return Unit.INSTANCE;
    }
}
