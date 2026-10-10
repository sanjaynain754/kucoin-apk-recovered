package com.kubi.clean.service;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.exception.CleanUserException;
import com.kubi.mvi.common.C19241c;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.clean.service.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AutoCleanLimitViewManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J0\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002JV\u0010\u001b\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020\u000bH\u0002J$\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/clean/service/AutoCleanLimitViewManager;", "", "<init>", "()V", "cacheConfig", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dialogHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "dismissLimitMessageView", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "showLimitMessageView", "requestConfig", "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;", "config", "setLimitTheme", "tvMessage", "Lcom/kubi/resources/widget/MarqueeTextView;", "layoutRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "iconTip", "Landroid/widget/ImageView;", "displayType", "", "setLimitContent", "Landroid/view/View;", "layoutArrowRight", "viewClose", "viewDivider", "pageId", "examineMessageAppend", "spannableString", "Landroid/text/SpannableStringBuilder;", "recycle", "dialogDismiss", "showTipDialog", "manager", "initExamineHolder", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "initKycDialogListener", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoCleanLimitViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCleanLimitViewManager.kt\ncom/kubi/clean/service/AutoCleanLimitViewManager\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AutoCleanUserIssue.kt\ncom/kubi/clean/exception/AutoCleanUserIssueKt\n*L\n1#1,536:1\n50#2,17:537\n50#2,17:557\n1#3:554\n44#4,2:555\n44#4,2:574\n*S KotlinDebug\n*F\n+ 1 AutoCleanLimitViewManager.kt\ncom/kubi/clean/service/AutoCleanLimitViewManager\n*L\n83#1:537,17\n340#1:557,17\n89#1:555,2\n346#1:574,2\n*E\n"})
public final class AutoCleanLimitViewManager {

    /* JADX INFO: renamed from: a */
    @Nullable
    public IPLimitConfig f19563a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public FragmentManager f19564b;

    /* JADX INFO: renamed from: b */
    public final void m20414b() {
        this.f19563a = null;
        this.f19564b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20413a(@Nullable ViewGroup viewGroup) throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                ViewExtKt.m66577h(viewGroup);
                m20414b();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【mvi 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new CleanUserException(thM103847exceptionOrNullimpl2, "AutoCleanLimitViewManager", false, null, 8, null), null, 2, null);
        }
    }
}
