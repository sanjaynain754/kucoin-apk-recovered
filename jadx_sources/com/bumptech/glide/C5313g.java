package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.request.C5373a;
import com.bumptech.glide.request.C5374b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p419l2.AbstractC42027a;
import p419l2.C42030d;
import p419l2.C42032f;
import p419l2.InterfaceC42029c;
import p419l2.InterfaceC42031e;
import p419l2.InterfaceFutureC42028b;
import p445m2.AbstractC42400k;
import p445m2.InterfaceC42399j;
import p485o2.C42947a;
import p523p2.C43358e;
import p523p2.C43363j;
import p523p2.C43364k;
import p680v1.AbstractC45352c;

/* JADX INFO: renamed from: com.bumptech.glide.g */
/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class C5313g<TranscodeType> extends AbstractC42027a<C5313g<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: P */
    public static final C42032f f6694P = new C42032f().mo92200i(AbstractC45352c.f101956c).mo92192d0(Priority.LOW).mo92207l0(true);

    /* JADX INFO: renamed from: B */
    public final Context f6695B;

    /* JADX INFO: renamed from: C */
    public final ComponentCallbacks2C5314h f6696C;

    /* JADX INFO: renamed from: D */
    public final Class<TranscodeType> f6697D;

    /* JADX INFO: renamed from: E */
    public final ComponentCallbacks2C5309c f6698E;

    /* JADX INFO: renamed from: F */
    public final C5311e f6699F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public AbstractC5315i<?, ? super TranscodeType> f6700G;

    /* JADX INFO: renamed from: H */
    @Nullable
    public Object f6701H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public List<InterfaceC42031e<TranscodeType>> f6702I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public C5313g<TranscodeType> f6703J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public C5313g<TranscodeType> f6704K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public Float f6705L;

    /* JADX INFO: renamed from: M */
    public boolean f6706M = true;

    /* JADX INFO: renamed from: N */
    public boolean f6707N;

    /* JADX INFO: renamed from: O */
    public boolean f6708O;

    @NonNull
    /* JADX INFO: renamed from: B0 */
    public <Y extends InterfaceC42399j<TranscodeType>> Y m6591B0(@NonNull Y y11) {
        return (Y) m6592C0(y11, null, C43358e.m95488b());
    }

    /* JADX INFO: renamed from: com.bumptech.glide.g$a */
    /* JADX INFO: compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6709a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6710b;

        static {
            int[] iArr = new int[Priority.values().length];
            f6710b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6710b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6710b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6710b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f6709a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6709a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6709a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6709a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6709a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6709a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6709a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6709a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final InterfaceC42029c m6603N0(Object obj, InterfaceC42399j<TranscodeType> interfaceC42399j, InterfaceC42031e<TranscodeType> interfaceC42031e, AbstractC42027a<?> abstractC42027a, RequestCoordinator requestCoordinator, AbstractC5315i<?, ? super TranscodeType> abstractC5315i, Priority priority, int i11, int i12, Executor executor) {
        Context context = this.f6695B;
        C5311e c5311e = this.f6699F;
        return SingleRequest.m6935w(context, c5311e, obj, this.f6701H, this.f6697D, abstractC42027a, i11, i12, priority, interfaceC42399j, interfaceC42031e, this.f6702I, requestCoordinator, c5311e.m6583f(), abstractC5315i.m6644b(), executor);
    }

    @NonNull
    /* JADX INFO: renamed from: O0 */
    public InterfaceFutureC42028b<TranscodeType> m6604O0() {
        return m6605P0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    /* JADX INFO: renamed from: P0 */
    public InterfaceFutureC42028b<TranscodeType> m6605P0(int i11, int i12) {
        C42030d c42030d = new C42030d(i11, i12);
        return (InterfaceFutureC42028b) m6592C0(c42030d, c42030d, C43358e.m95487a());
    }

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC42029c m6610u0(InterfaceC42399j<TranscodeType> interfaceC42399j, @Nullable InterfaceC42031e<TranscodeType> interfaceC42031e, AbstractC42027a<?> abstractC42027a, Executor executor) {
        return m6611v0(new Object(), interfaceC42399j, interfaceC42031e, null, this.f6700G, abstractC42027a.m92162B(), abstractC42027a.m92226y(), abstractC42027a.m92225x(), abstractC42027a, executor);
    }

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC42029c m6611v0(Object obj, InterfaceC42399j<TranscodeType> interfaceC42399j, @Nullable InterfaceC42031e<TranscodeType> interfaceC42031e, @Nullable RequestCoordinator requestCoordinator, AbstractC5315i<?, ? super TranscodeType> abstractC5315i, Priority priority, int i11, int i12, AbstractC42027a<?> abstractC42027a, Executor executor) {
        C5373a c5373a;
        RequestCoordinator requestCoordinator2;
        if (this.f6704K != null) {
            c5373a = new C5373a(obj, requestCoordinator);
            requestCoordinator2 = c5373a;
        } else {
            c5373a = null;
            requestCoordinator2 = requestCoordinator;
        }
        InterfaceC42029c interfaceC42029cM6612w0 = m6612w0(obj, interfaceC42399j, interfaceC42031e, requestCoordinator2, abstractC5315i, priority, i11, i12, abstractC42027a, executor);
        if (c5373a == null) {
            return interfaceC42029cM6612w0;
        }
        int iM92226y = this.f6704K.m92226y();
        int iM92225x = this.f6704K.m92225x();
        if (C43364k.m95528u(i11, i12) && !this.f6704K.m92178S()) {
            iM92226y = abstractC42027a.m92226y();
            iM92225x = abstractC42027a.m92225x();
        }
        C5313g<TranscodeType> c5313g = this.f6704K;
        C5373a c5373a2 = c5373a;
        c5373a2.m6963n(interfaceC42029cM6612w0, c5313g.m6611v0(obj, interfaceC42399j, interfaceC42031e, c5373a2, c5313g.f6700G, c5313g.m92162B(), iM92226y, iM92225x, this.f6704K, executor));
        return c5373a2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC42029c m6612w0(Object obj, InterfaceC42399j<TranscodeType> interfaceC42399j, InterfaceC42031e<TranscodeType> interfaceC42031e, @Nullable RequestCoordinator requestCoordinator, AbstractC5315i<?, ? super TranscodeType> abstractC5315i, Priority priority, int i11, int i12, AbstractC42027a<?> abstractC42027a, Executor executor) {
        C5313g<TranscodeType> c5313g = this.f6703J;
        if (c5313g == null) {
            if (this.f6705L == null) {
                return m6603N0(obj, interfaceC42399j, interfaceC42031e, abstractC42027a, requestCoordinator, abstractC5315i, priority, i11, i12, executor);
            }
            C5374b c5374b = new C5374b(obj, requestCoordinator);
            c5374b.m6967m(m6603N0(obj, interfaceC42399j, interfaceC42031e, abstractC42027a, c5374b, abstractC5315i, priority, i11, i12, executor), m6603N0(obj, interfaceC42399j, interfaceC42031e, abstractC42027a.clone().mo92205k0(this.f6705L.floatValue()), c5374b, abstractC5315i, m6615z0(priority), i11, i12, executor));
            return c5374b;
        }
        if (this.f6708O) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5315i<?, ? super TranscodeType> abstractC5315i2 = c5313g.f6706M ? abstractC5315i : c5313g.f6700G;
        Priority priorityM92162B = c5313g.m92172L() ? this.f6703J.m92162B() : m6615z0(priority);
        int iM92226y = this.f6703J.m92226y();
        int iM92225x = this.f6703J.m92225x();
        if (C43364k.m95528u(i11, i12) && !this.f6703J.m92178S()) {
            iM92226y = abstractC42027a.m92226y();
            iM92225x = abstractC42027a.m92225x();
        }
        C5374b c5374b2 = new C5374b(obj, requestCoordinator);
        InterfaceC42029c interfaceC42029cM6603N0 = m6603N0(obj, interfaceC42399j, interfaceC42031e, abstractC42027a, c5374b2, abstractC5315i, priority, i11, i12, executor);
        this.f6708O = true;
        C5313g<TranscodeType> c5313g2 = this.f6703J;
        InterfaceC42029c interfaceC42029cM6611v0 = c5313g2.m6611v0(obj, interfaceC42399j, interfaceC42031e, c5374b2, abstractC5315i2, priorityM92162B, iM92226y, iM92225x, c5313g2, executor);
        this.f6708O = false;
        c5374b2.m6967m(interfaceC42029cM6603N0, interfaceC42029cM6611v0);
        return c5374b2;
    }

    @NonNull
    /* JADX INFO: renamed from: z0 */
    public final Priority m6615z0(@NonNull Priority priority) {
        int i11 = a.f6710b[priority.ordinal()];
        if (i11 == 1) {
            return Priority.NORMAL;
        }
        if (i11 == 2) {
            return Priority.HIGH;
        }
        if (i11 == 3 || i11 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m92162B());
    }

    @SuppressLint({"CheckResult"})
    public C5313g(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, ComponentCallbacks2C5314h componentCallbacks2C5314h, Class<TranscodeType> cls, Context context) {
        this.f6698E = componentCallbacks2C5309c;
        this.f6696C = componentCallbacks2C5314h;
        this.f6697D = cls;
        this.f6695B = context;
        this.f6700G = componentCallbacks2C5314h.m6630r(cls);
        this.f6699F = componentCallbacks2C5309c.m6565i();
        m6590A0(componentCallbacks2C5314h.m6628p());
        mo6606a(componentCallbacks2C5314h.m6629q());
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: A0 */
    public final void m6590A0(List<InterfaceC42031e<Object>> list) {
        Iterator<InterfaceC42031e<Object>> it = list.iterator();
        while (it.hasNext()) {
            mo6608s0((InterfaceC42031e) it.next());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public <Y extends InterfaceC42399j<TranscodeType>> Y m6592C0(@NonNull Y y11, @Nullable InterfaceC42031e<TranscodeType> interfaceC42031e, Executor executor) {
        return (Y) m6593D0(y11, interfaceC42031e, this, executor);
    }

    /* JADX INFO: renamed from: D0 */
    public final <Y extends InterfaceC42399j<TranscodeType>> Y m6593D0(@NonNull Y y11, @Nullable InterfaceC42031e<TranscodeType> interfaceC42031e, AbstractC42027a<?> abstractC42027a, Executor executor) {
        C43363j.m95506d(y11);
        if (this.f6707N) {
            InterfaceC42029c interfaceC42029cM6610u0 = m6610u0(y11, interfaceC42031e, abstractC42027a, executor);
            InterfaceC42029c request = y11.getRequest();
            if (interfaceC42029cM6610u0.mo6938d(request) && !m6595F0(abstractC42027a, request)) {
                if (!((InterfaceC42029c) C43363j.m95506d(request)).isRunning()) {
                    request.mo6943i();
                }
                return y11;
            }
            this.f6696C.m6626n(y11);
            y11.mo92230g(interfaceC42029cM6610u0);
            this.f6696C.m6617B(y11, interfaceC42029cM6610u0);
            return y11;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    /* JADX INFO: renamed from: E0 */
    public AbstractC42400k<ImageView, TranscodeType> m6594E0(@NonNull ImageView imageView) {
        AbstractC42027a abstractC42027aMo92180U;
        C43364k.m95509b();
        C43363j.m95506d(imageView);
        if (!m92177R() && m92175P() && imageView.getScaleType() != null) {
            switch (a.f6709a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC42027aMo92180U = clone().mo92180U();
                    break;
                case 2:
                    abstractC42027aMo92180U = clone().mo92181V();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC42027aMo92180U = clone().mo92182W();
                    break;
                case 6:
                    abstractC42027aMo92180U = clone().mo92181V();
                    break;
                default:
                    abstractC42027aMo92180U = this;
                    break;
            }
        } else {
            abstractC42027aMo92180U = this;
        }
        return (AbstractC42400k) m6593D0(this.f6699F.m6578a(imageView, this.f6697D), null, abstractC42027aMo92180U, C43358e.m95488b());
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m6595F0(AbstractC42027a<?> abstractC42027a, InterfaceC42029c interfaceC42029c) {
        if (!abstractC42027a.m92171K() && interfaceC42029c.isComplete()) {
            return true;
        }
        return false;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: G0 */
    public C5313g<TranscodeType> mo6596G0(@Nullable InterfaceC42031e<TranscodeType> interfaceC42031e) {
        if (m92170J()) {
            return clone().mo6596G0(interfaceC42031e);
        }
        this.f6702I = null;
        return mo6608s0(interfaceC42031e);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: H0 */
    public C5313g<TranscodeType> mo6597H0(@Nullable Uri uri) {
        return m6602M0(uri);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: I0 */
    public C5313g<TranscodeType> mo6598I0(@Nullable File file) {
        return m6602M0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: J0 */
    public C5313g<TranscodeType> mo6599J0(@Nullable @DrawableRes @RawRes Integer num) {
        return m6602M0(num).mo6606a(C42032f.m92240x0(C42947a.m94278c(this.f6695B)));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: K0 */
    public C5313g<TranscodeType> mo6600K0(@Nullable Object obj) {
        return m6602M0(obj);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: L0 */
    public C5313g<TranscodeType> mo6601L0(@Nullable String str) {
        return m6602M0(str);
    }

    @NonNull
    /* JADX INFO: renamed from: M0 */
    public final C5313g<TranscodeType> m6602M0(@Nullable Object obj) {
        if (m92170J()) {
            return clone().m6602M0(obj);
        }
        this.f6701H = obj;
        this.f6707N = true;
        return m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s0 */
    public C5313g<TranscodeType> mo6608s0(@Nullable InterfaceC42031e<TranscodeType> interfaceC42031e) {
        if (m92170J()) {
            return clone().mo6608s0(interfaceC42031e);
        }
        if (interfaceC42031e != null) {
            if (this.f6702I == null) {
                this.f6702I = new ArrayList();
            }
            this.f6702I.add(interfaceC42031e);
        }
        return m92199h0();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C5313g<TranscodeType> mo6606a(@NonNull AbstractC42027a<?> abstractC42027a) {
        C43363j.m95506d(abstractC42027a);
        return (C5313g) super.mo6606a(abstractC42027a);
    }

    @Override // p419l2.AbstractC42027a
    @CheckResult
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5313g<TranscodeType> clone() {
        C5313g<TranscodeType> c5313g = (C5313g) super.clone();
        c5313g.f6700G = c5313g.f6700G.clone();
        if (c5313g.f6702I != null) {
            c5313g.f6702I = new ArrayList(c5313g.f6702I);
        }
        C5313g<TranscodeType> c5313g2 = c5313g.f6703J;
        if (c5313g2 != null) {
            c5313g.f6703J = c5313g2.clone();
        }
        C5313g<TranscodeType> c5313g3 = c5313g.f6704K;
        if (c5313g3 != null) {
            c5313g.f6704K = c5313g3.clone();
        }
        return c5313g;
    }

    @NonNull
    /* JADX INFO: renamed from: y0 */
    public C5313g<TranscodeType> mo6614y0(@Nullable C5313g<TranscodeType> c5313g) {
        if (m92170J()) {
            return clone().mo6614y0(c5313g);
        }
        this.f6704K = c5313g;
        return m92199h0();
    }
}
