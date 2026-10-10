package com.kubi.kweb.p093ui;

import com.kubi.kweb.api.CmsArticle;
import com.kubi.kweb.api.CmsArticleType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import mh0.C42546a;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: KWebTemplateActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kweb.ui.KWebTemplateActivity$convertHtml$2", m90122f = "KWebTemplateActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebTemplateActivity$convertHtml$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ CmsArticle $article;
    int label;
    final /* synthetic */ KWebTemplateActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebTemplateActivity$convertHtml$2(KWebTemplateActivity kWebTemplateActivity, CmsArticle cmsArticle, Continuation<? super KWebTemplateActivity$convertHtml$2> continuation) {
        super(2, continuation);
        this.this$0 = kWebTemplateActivity;
        this.$article = cmsArticle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebTemplateActivity$convertHtml$2(this.this$0, this.$article, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((KWebTemplateActivity$convertHtml$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Integer numBoxInt;
        CmsArticleType cmsArticleType;
        CmsArticleType cmsArticleType2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InputStream inputStreamOpen = this.this$0.getAssets().open("web/news_template.html");
            try {
                Document documentM93276a = C42546a.m93276a(inputStreamOpen, "UTF-8", "");
                String path = null;
                CloseableKt.closeFinally(inputStreamOpen, null);
                Element elementM94904y0 = documentM93276a.m94904y0("id_title");
                Element elementM94904y1 = documentM93276a.m94904y0("id_time");
                Element elementM94904y2 = documentM93276a.m94904y0("id_category");
                Element elementM94904y3 = documentM93276a.m94904y0("id_content");
                if (elementM94904y0 != null) {
                    elementM94904y0.m94873e0(C27041f.m66668h(this.$article.getTitle()));
                }
                if (elementM94904y1 != null) {
                    elementM94904y1.m94873e0(TimeUtils.m66424k(C27039d.m66652l(this.$article.getFirst_publish_at()) * ((long) 1000)));
                }
                ArrayList<CmsArticleType> categories = this.$article.getCategories();
                if (categories != null) {
                    numBoxInt = Boxing.boxInt(categories.size());
                } else {
                    numBoxInt = null;
                }
                if (C27039d.m66650j(numBoxInt) > 0) {
                    if (MultiLanguageManager.m56980j()) {
                        if (elementM94904y2 != null) {
                            ArrayList<CmsArticleType> categories2 = this.$article.getCategories();
                            if (categories2 != null && (cmsArticleType2 = categories2.get(0)) != null) {
                                path = cmsArticleType2.getName();
                            }
                            elementM94904y2.m94873e0(C27041f.m66668h(path));
                        }
                    } else if (elementM94904y2 != null) {
                        ArrayList<CmsArticleType> categories3 = this.$article.getCategories();
                        if (categories3 != null && (cmsArticleType = categories3.get(0)) != null) {
                            path = cmsArticleType.getPath();
                        }
                        elementM94904y2.m94873e0(C27041f.m66668h(path));
                    }
                }
                if (elementM94904y3 != null) {
                    elementM94904y3.m94873e0(C27041f.m66668h(this.$article.getContent()));
                }
                KWebTemplateActivity kWebTemplateActivity = this.this$0;
                String string = documentM93276a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return kWebTemplateActivity.m36755Z0(string);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStreamOpen, th2);
                    throw th3;
                }
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
