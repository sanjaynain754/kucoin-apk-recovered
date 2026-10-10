package com.kubi.kweb.p093ui;

import com.kubi.host.HostManager;
import com.kubi.kweb.api.CmsArticle;
import com.kubi.kweb.api.IWebApi;
import com.kubi.sdk.web.util.C24329b;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KWebTemplateActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kweb.ui.KWebTemplateActivity$loadTemplate$2", m90122f = "KWebTemplateActivity.kt", m90123i = {1}, m90124l = {69, 71}, m90125m = "invokeSuspend", m90126n = {"article"}, m90127s = {"L$0"})
public final class KWebTemplateActivity$loadTemplate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $path;
    Object L$0;
    int label;
    final /* synthetic */ KWebTemplateActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebTemplateActivity$loadTemplate$2(String str, KWebTemplateActivity kWebTemplateActivity, Continuation<? super KWebTemplateActivity$loadTemplate$2> continuation) {
        super(2, continuation);
        this.$path = str;
        this.this$0 = kWebTemplateActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebTemplateActivity$loadTemplate$2(this.$path, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((KWebTemplateActivity$loadTemplate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if (r13 == r0) goto L21;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return (String) obj;
            }
            ResultKt.throwOnFailure(obj);
            C24329b c24329b = C24329b.f48558a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadTemplate path:");
            HostManager hostManager = HostManager.a;
            sb2.append(hostManager.c());
            sb2.append("/cms/articles");
            sb2.append(this.$path);
            sb2.append(".json");
            c24329b.m58864d("templateLoad", sb2.toString());
            IWebApi iWebApi = (IWebApi) C42597a.m93386b().create(IWebApi.class);
            String str = hostManager.c() + "/cms/articles" + this.$path + ".json";
            this.label = 1;
            obj = iWebApi.getArticle(str, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            CmsArticle cmsArticle = (CmsArticle) obj;
            this.this$0.f31034t = cmsArticle;
            KWebTemplateActivity kWebTemplateActivity = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cmsArticle);
            this.label = 2;
            obj = kWebTemplateActivity.m36752W0(cmsArticle, this);
        } catch (Exception e11) {
            C24329b.m58861c(C24329b.f48558a, "templateLoad", "loadTemplate error:" + e11.getMessage() + ", path:" + HostManager.a.c() + "/cms/articles" + this.$path + ".json", null, 4, null);
            return "";
        }
    }
}
