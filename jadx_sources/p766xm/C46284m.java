package p766xm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.NoticeEntity;
import com.kubi.kumex.view.FuturesSuffixTextView;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27017c;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: xm.m */
/* JADX INFO: compiled from: Announcement.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J0\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\""}, m90084d2 = {"Lcom/kubi/kumex/view/Announcement;", "", "<init>", "()V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "waitDisposable", "Lio/reactivex/disposables/Disposable;", "showDisposable", "lineCount", "", "getLineCount", "()I", "setLineCount", "(I)V", "loadAndRender", "", "rootView", "fragment", "Lcom/kubi/sdk/BaseFragment;", "dispose", "startWaitTimer", TUIConstants.TUIChat.NOTICE, "Lcom/kubi/kumex/data/platform/model/NoticeEntity;", "startShowTimer", "render", "expandOrCollapse", "content", "Lcom/kubi/kumex/view/FuturesSuffixTextView;", "more", "Landroid/widget/TextView;", "expand", "", "isHtml", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnnouncement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Announcement.kt\ncom/kubi/kumex/view/Announcement\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,188:1\n84#2:189\n75#2,2:190\n*S KotlinDebug\n*F\n+ 1 Announcement.kt\ncom/kubi/kumex/view/Announcement\n*L\n54#1:189\n122#1:190,2\n*E\n"})
public final class C46284m {

    /* JADX INFO: renamed from: a */
    @Nullable
    public View f103855a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Disposable f103856b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Disposable f103857c;

    /* JADX INFO: renamed from: d */
    public int f103858d;

    /* JADX INFO: renamed from: xm.m$a */
    /* JADX INFO: compiled from: Announcement.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/view/Announcement$render$3", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FuturesSuffixTextView f103860c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f103861d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f103862e;

        public a(FuturesSuffixTextView futuresSuffixTextView, TextView textView, boolean z11) {
            this.f103860c = futuresSuffixTextView;
            this.f103861d = textView;
            this.f103862e = z11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C46284m.this.m102043A(this.f103860c.getLineCount());
            if (C46284m.this.getF103858d() > 2) {
                this.f103860c.setMaxLines(2);
                this.f103861d.setText(C27017c.f54310a.m66516f(R$string.home_rank_expand, new Object[0]));
                TextView textView = this.f103861d;
                Intrinsics.checkNotNull(textView);
                C27046k.m66685H(textView);
            } else {
                if (this.f103862e) {
                    this.f103860c.m36653k(true);
                }
                TextView textView2 = this.f103861d;
                Intrinsics.checkNotNull(textView2);
                ViewExtKt.m66577h(textView2);
            }
            this.f103860c.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m102047n(FuturesSuffixTextView futuresSuffixTextView, TextView textView, int i11, boolean z11, boolean z12) {
        if (z11) {
            if (z12) {
                futuresSuffixTextView.m36653k(true);
            }
            futuresSuffixTextView.setMaxLines(i11);
            textView.setText(C27017c.f54310a.m66516f(R$string.home_rank_toggle, new Object[0]));
            return;
        }
        if (z12) {
            futuresSuffixTextView.m36653k(false);
        }
        futuresSuffixTextView.setMaxLines(2);
        textView.setText(C27017c.f54310a.m66516f(R$string.home_rank_expand, new Object[0]));
    }

    /* JADX INFO: renamed from: r */
    public static final NoticeEntity m102035r() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25018m();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m102036s(View view, C46284m c46284m, NoticeEntity noticeEntity) {
        String content;
        if (view == null || noticeEntity == null || (content = noticeEntity.getContent()) == null || content.length() == 0) {
            c46284m.m102046m();
            return Unit.INSTANCE;
        }
        if (C46392a.m102324f(C46894j.f104736a.m103275n(), 0L) >= C27039d.m66652l(noticeEntity.getStart())) {
            c46284m.m102046m();
            return Unit.INSTANCE;
        }
        c46284m.m102045E(view, noticeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m102040x(NoticeEntity noticeEntity, View view) {
        Router.f46192a.m56184f(C27041f.m66668h(noticeEntity.getDirectUrl())).m4048k();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m102041y(Ref.BooleanRef booleanRef, C46284m c46284m, FuturesSuffixTextView futuresSuffixTextView, TextView textView, boolean z11, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = !booleanRef.element;
        Intrinsics.checkNotNull(futuresSuffixTextView);
        Intrinsics.checkNotNull(textView);
        c46284m.m102047n(futuresSuffixTextView, textView, c46284m.f103858d, booleanRef.element, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m102042z(NoticeEntity noticeEntity, C46284m c46284m, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C46392a.m102330m(C46894j.f104736a.m103275n(), C27039d.m66652l(noticeEntity.getStart()));
        c46284m.m102046m();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m102043A(int i11) {
        this.f103858d = i11;
    }

    /* JADX INFO: renamed from: m */
    public final void m102046m() {
        View view = this.f103855a;
        if (view != null) {
            ViewExtKt.m66577h(view);
        }
        this.f103855a = null;
        this.f103858d = 0;
        Disposable disposable = this.f103856b;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f103857c;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getF103858d() {
        return this.f103858d;
    }

    /* JADX INFO: renamed from: q */
    public final void m102050q(@Nullable final View view, @NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: xm.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46284m.m102035r();
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: xm.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46284m.m102036s(view, this, (NoticeEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: xm.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C46284m.m102037t(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xm.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46284m.m102038u((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: xm.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C46284m.m102039v(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: w */
    public final void m102051w(View view, final NoticeEntity noticeEntity) {
        if (this.f103855a == null) {
            View viewFindViewById = view.findViewById(R$id.announcement_layout);
            this.f103855a = viewFindViewById;
            if (viewFindViewById == null) {
                View viewInflate = LayoutInflater.from(view.getContext()).inflate(R$layout.bkumex_announcement, (ViewGroup) null, false);
                this.f103855a = viewInflate;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).addView(viewInflate, 0);
                }
            } else if (viewFindViewById != null) {
                C27046k.m66685H(viewFindViewById);
            }
        }
        View view2 = this.f103855a;
        if (view2 == null) {
            return;
        }
        final FuturesSuffixTextView futuresSuffixTextView = (FuturesSuffixTextView) view2.findViewById(R$id.announcement_content);
        View viewFindViewById2 = view2.findViewById(R$id.announcement_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: xm.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46284m.m102042z(noticeEntity, this, (View) obj);
            }
        });
        final boolean zM102049p = m102049p(noticeEntity);
        if (zM102049p) {
            futuresSuffixTextView.setText(noticeEntity.getContent());
            futuresSuffixTextView.onMoreClick(new View.OnClickListener() { // from class: xm.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C46284m.m102040x(noticeEntity, view3);
                }
            });
        } else {
            futuresSuffixTextView.setText(noticeEntity.getContent());
        }
        futuresSuffixTextView.m36653k(false);
        final TextView textView = (TextView) view2.findViewById(R$id.announcement_more);
        futuresSuffixTextView.getViewTreeObserver().addOnPreDrawListener(new a(futuresSuffixTextView, textView, zM102049p));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66575f(textView, new Function1() { // from class: xm.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46284m.m102041y(booleanRef, this, futuresSuffixTextView, textView, zM102049p, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m102019C(C46284m c46284m, Long l11) {
        c46284m.m102046m();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m102020D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m102021F(C46284m c46284m, View view, NoticeEntity noticeEntity, Long l11) {
        c46284m.m102044B(view, noticeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m102022G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final void m102037t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m102038u(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m102039v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public final void m102044B(View view, NoticeEntity noticeEntity) {
        long jM66652l = C27039d.m66652l(noticeEntity.getEnd()) - System.currentTimeMillis();
        if (jM66652l <= 0) {
            m102046m();
            return;
        }
        m102051w(view, noticeEntity);
        Disposable disposable = this.f103857c;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> observableObserveOn = Observable.timer(jM66652l, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: xm.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46284m.m102019C(this.f103851b, (Long) obj);
            }
        };
        this.f103857c = observableObserveOn.doOnNext(new Consumer() { // from class: xm.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C46284m.m102020D(function1, obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: E */
    public final void m102045E(final View view, final NoticeEntity noticeEntity) {
        long jM66652l = C27039d.m66652l(noticeEntity.getStart()) - System.currentTimeMillis();
        if (jM66652l > 0) {
            Disposable disposable = this.f103856b;
            if (disposable != null) {
                disposable.dispose();
            }
            Observable<Long> observableObserveOn = Observable.timer(jM66652l, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: xm.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46284m.m102021F(this.f103840b, view, noticeEntity, (Long) obj);
                }
            };
            this.f103856b = observableObserveOn.doOnNext(new Consumer() { // from class: xm.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C46284m.m102022G(function1, obj);
                }
            }).subscribe();
            return;
        }
        m102044B(view, noticeEntity);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m102049p(NoticeEntity noticeEntity) {
        boolean z11;
        String directUrl = noticeEntity.getDirectUrl();
        if (directUrl != null && directUrl.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }
}
