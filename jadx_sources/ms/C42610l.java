package ms;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.kubi.notice.R$id;
import com.kubi.notice.R$layout;
import com.kubi.notice.lib.api.INoticeApi;
import com.kubi.notice.lib.service.NoticeDepend;
import com.kubi.notice.notice.NoticeDialogEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ms.l */
/* JADX INFO: compiled from: NoticeDialogManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/notice/lib/ui/dialog/NoticeDialogManager;", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "<init>", "()V", "TAG_NOTICE_DIALOG", "", "noticeApi", "Lcom/kubi/notice/lib/api/INoticeApi;", "kotlin.jvm.PlatformType", "getNoticeApi", "()Lcom/kubi/notice/lib/api/INoticeApi;", "noticeApi$delegate", "Lkotlin/Lazy;", "noticeList", "Ljava/util/ArrayList;", "Lcom/kubi/notice/notice/NoticeDialogEntity;", "Lkotlin/collections/ArrayList;", "getNoticeList", "()Ljava/util/ArrayList;", "showNoticeDialog", "", "module", "getNoticeDialogInfo", "onLanguageChange", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeDialogManager.kt\ncom/kubi/notice/lib/ui/dialog/NoticeDialogManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class C42610l implements MultiLanguageManager.a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42610l f94327a = new C42610l();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f94328b = LazyKt.lazy(new Function0() { // from class: ms.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42610l.m93423s();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ArrayList<NoticeDialogEntity> f94329c = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public static final Unit m93421p(List list) {
        ArrayList<NoticeDialogEntity> arrayList = f94329c;
        arrayList.clear();
        arrayList.addAll(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m93424u(final NoticeDialogEntity noticeDialogEntity, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tvContent;
        ((TextView) viewHolder.getView(i11)).setMovementMethod(ScrollingMovementMethod.getInstance());
        int i12 = R$id.tvTitle;
        BaseViewHolder gone = viewHolder.setGone(i12, !TextUtils.isEmpty(noticeDialogEntity.getTitle()));
        int i13 = R$id.tvLinkButton;
        gone.setGone(i13, !TextUtils.isEmpty(noticeDialogEntity.getLinkText())).setText(i12, C27041f.m66668h(noticeDialogEntity.getTitle())).setText(i11, C27041f.m66668h(noticeDialogEntity.getContent())).setText(i13, C27041f.m66668h(noticeDialogEntity.getLinkText())).setOnClickListener(R$id.ivClose, new View.OnClickListener() { // from class: ms.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42610l.m93425v(dialogFragmentHelper, view);
            }
        }).setOnClickListener(i13, new View.OnClickListener() { // from class: ms.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42610l.m93426w(noticeDialogEntity, dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final INoticeApi m93430l() {
        return (INoticeApi) f94328b.getValue();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: m */
    public final void m93431m() {
        if (NoticeDepend.f36385a.m43209a()) {
            f94329c.clear();
            Observable<R> observableCompose = m93430l().m43158c().compose(C24217a1.m58390n());
            final Function1 function1 = new Function1() { // from class: ms.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C42610l.m93421p((List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: ms.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C42610l.m93422q(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: ms.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C42610l.m93419n((Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: ms.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C42610l.m93420o(function2, obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
    public void onLanguageChange(@NotNull LanguageType language) {
        Intrinsics.checkNotNullParameter(language, "language");
        m93431m();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final ArrayList<NoticeDialogEntity> m93432r() {
        return f94329c;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: t */
    public final void m93433t(@NotNull String module) {
        NoticeDialogEntity noticeDialogEntityPrevious;
        Intrinsics.checkNotNullParameter(module, "module");
        if (NoticeDepend.f36385a.m43209a() && !TextUtils.isEmpty(module)) {
            ArrayList<NoticeDialogEntity> arrayList = f94329c;
            ListIterator<NoticeDialogEntity> listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    noticeDialogEntityPrevious = null;
                    break;
                }
                noticeDialogEntityPrevious = listIterator.previous();
            } while (!Intrinsics.areEqual(noticeDialogEntityPrevious.getModule(), module));
            final NoticeDialogEntity noticeDialogEntity = noticeDialogEntityPrevious;
            if (noticeDialogEntity == null) {
                return;
            }
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.kucoin_dialog_notice, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: ms.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C42610l.m93424u(noticeDialogEntity, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            dialogFragmentHelperM54237f4.setCancelable(false);
            C42899b.m94076f(dialogFragmentHelperM54237f4, "NoticeDialog");
            Observable<R> observableCompose = m93430l().m43161f(noticeDialogEntity.getId()).compose(C24217a1.m58389m());
            Consumer consumer = new Consumer() { // from class: ms.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C42610l.m93427x(obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: ms.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C42610l.m93428y((Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: ms.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C42610l.m93429z(function1, obj);
                }
            });
            f94329c.remove(noticeDialogEntity);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m93419n(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m93420o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m93422q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final INoticeApi m93423s() {
        return (INoticeApi) C42597a.m93386b().create(INoticeApi.class);
    }

    /* JADX INFO: renamed from: v */
    public static final void m93425v(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static final void m93426w(NoticeDialogEntity noticeDialogEntity, DialogFragmentHelper dialogFragmentHelper, View view) {
        String linkUrl;
        String appUri = noticeDialogEntity.getAppUri();
        if (appUri != null && appUri.length() != 0) {
            linkUrl = noticeDialogEntity.getAppUri();
        } else {
            linkUrl = noticeDialogEntity.getLinkUrl();
        }
        Router.f46192a.m56184f(C27041f.m66668h(linkUrl)).m4048k();
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m93428y(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m93429z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m93427x(Object obj) {
    }
}
