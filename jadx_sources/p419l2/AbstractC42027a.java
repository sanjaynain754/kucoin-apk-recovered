package p419l2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.Map;
import p048c2.C4784c;
import p048c2.C4793j;
import p048c2.C4794k;
import p048c2.C4795l;
import p048c2.C4802s;
import p048c2.C4804u;
import p280g2.C37790c;
import p280g2.C37793f;
import p280g2.C37796i;
import p419l2.AbstractC42027a;
import p485o2.C42949c;
import p523p2.C43355b;
import p523p2.C43363j;
import p523p2.C43364k;
import p628t1.C44611c;
import p628t1.C44612d;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC42027a<T extends AbstractC42027a<T>> implements Cloneable {

    /* JADX INFO: renamed from: A */
    public boolean f92273A;

    /* JADX INFO: renamed from: b */
    public int f92274b;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Drawable f92278f;

    /* JADX INFO: renamed from: g */
    public int f92279g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Drawable f92280h;

    /* JADX INFO: renamed from: i */
    public int f92281i;

    /* JADX INFO: renamed from: n */
    public boolean f92286n;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Drawable f92288p;

    /* JADX INFO: renamed from: q */
    public int f92289q;

    /* JADX INFO: renamed from: u */
    public boolean f92293u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public Resources.Theme f92294v;

    /* JADX INFO: renamed from: w */
    public boolean f92295w;

    /* JADX INFO: renamed from: x */
    public boolean f92296x;

    /* JADX INFO: renamed from: y */
    public boolean f92297y;

    /* JADX INFO: renamed from: c */
    public float f92275c = 1.0f;

    /* JADX INFO: renamed from: d */
    @NonNull
    public AbstractC45352c f92276d = AbstractC45352c.f101958e;

    /* JADX INFO: renamed from: e */
    @NonNull
    public Priority f92277e = Priority.NORMAL;

    /* JADX INFO: renamed from: j */
    public boolean f92282j = true;

    /* JADX INFO: renamed from: k */
    public int f92283k = -1;

    /* JADX INFO: renamed from: l */
    public int f92284l = -1;

    /* JADX INFO: renamed from: m */
    @NonNull
    public InterfaceC44610b f92285m = C42949c.m94283c();

    /* JADX INFO: renamed from: o */
    public boolean f92287o = true;

    /* JADX INFO: renamed from: r */
    @NonNull
    public C44613e f92290r = new C44613e();

    /* JADX INFO: renamed from: s */
    @NonNull
    public Map<Class<?>, InterfaceC44616h<?>> f92291s = new C43355b();

    /* JADX INFO: renamed from: t */
    @NonNull
    public Class<?> f92292t = Object.class;

    /* JADX INFO: renamed from: z */
    public boolean f92298z = true;

    /* JADX INFO: renamed from: O */
    public static boolean m92160O(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public T mo92179T() {
        this.f92293u = true;
        return (T) m92197g0();
    }

    @NonNull
    /* JADX INFO: renamed from: X */
    public final T m92183X(@NonNull DownsampleStrategy downsampleStrategy, @NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        return (T) m92195f0(downsampleStrategy, interfaceC44616h, false);
    }

    @NonNull
    /* JADX INFO: renamed from: e0 */
    public final T m92194e0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        return (T) m92195f0(downsampleStrategy, interfaceC44616h, true);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o0 */
    public T mo92213o0(@NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        return (T) m92215p0(interfaceC44616h, true);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: q0 */
    public T mo92217q0(@NonNull InterfaceC44616h<Bitmap>... interfaceC44616hArr) {
        if (interfaceC44616hArr.length > 1) {
            return (T) m92215p0(new C44611c(interfaceC44616hArr), true);
        }
        return interfaceC44616hArr.length == 1 ? (T) mo92213o0(interfaceC44616hArr[0]) : (T) m92199h0();
    }

    /* JADX INFO: renamed from: A */
    public final int m92161A() {
        return this.f92281i;
    }

    @NonNull
    /* JADX INFO: renamed from: B */
    public final Priority m92162B() {
        return this.f92277e;
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public final Class<?> m92163C() {
        return this.f92292t;
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public final InterfaceC44610b m92164D() {
        return this.f92285m;
    }

    /* JADX INFO: renamed from: E */
    public final float m92165E() {
        return this.f92275c;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final Resources.Theme m92166F() {
        return this.f92294v;
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public final Map<Class<?>, InterfaceC44616h<?>> m92167G() {
        return this.f92291s;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m92168H() {
        return this.f92273A;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m92169I() {
        return this.f92296x;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m92170J() {
        return this.f92295w;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m92171K() {
        return this.f92282j;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m92172L() {
        return m92174N(8);
    }

    /* JADX INFO: renamed from: M */
    public boolean m92173M() {
        return this.f92298z;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m92174N(int i11) {
        return m92160O(this.f92274b, i11);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m92175P() {
        return this.f92287o;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m92176Q() {
        return this.f92286n;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m92177R() {
        return m92174N(2048);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m92178S() {
        return C43364k.m95528u(this.f92284l, this.f92283k);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: U */
    public T mo92180U() {
        return (T) m92184Y(DownsampleStrategy.f6964e, new C4793j());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: V */
    public T mo92181V() {
        return (T) m92183X(DownsampleStrategy.f6963d, new C4794k());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: W */
    public T mo92182W() {
        return (T) m92183X(DownsampleStrategy.f6962c, new C4804u());
    }

    @NonNull
    /* JADX INFO: renamed from: Y */
    public final T m92184Y(@NonNull DownsampleStrategy downsampleStrategy, @NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        if (this.f92295w) {
            return (T) clone().m92184Y(downsampleStrategy, interfaceC44616h);
        }
        mo92204k(downsampleStrategy);
        return (T) m92215p0(interfaceC44616h, false);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public T mo6606a(@NonNull AbstractC42027a<?> abstractC42027a) {
        if (this.f92295w) {
            return (T) clone().mo6606a(abstractC42027a);
        }
        if (m92160O(abstractC42027a.f92274b, 2)) {
            this.f92275c = abstractC42027a.f92275c;
        }
        if (m92160O(abstractC42027a.f92274b, 262144)) {
            this.f92296x = abstractC42027a.f92296x;
        }
        if (m92160O(abstractC42027a.f92274b, 1048576)) {
            this.f92273A = abstractC42027a.f92273A;
        }
        if (m92160O(abstractC42027a.f92274b, 4)) {
            this.f92276d = abstractC42027a.f92276d;
        }
        if (m92160O(abstractC42027a.f92274b, 8)) {
            this.f92277e = abstractC42027a.f92277e;
        }
        if (m92160O(abstractC42027a.f92274b, 16)) {
            this.f92278f = abstractC42027a.f92278f;
            this.f92279g = 0;
            this.f92274b &= -33;
        }
        if (m92160O(abstractC42027a.f92274b, 32)) {
            this.f92279g = abstractC42027a.f92279g;
            this.f92278f = null;
            this.f92274b &= -17;
        }
        if (m92160O(abstractC42027a.f92274b, 64)) {
            this.f92280h = abstractC42027a.f92280h;
            this.f92281i = 0;
            this.f92274b &= -129;
        }
        if (m92160O(abstractC42027a.f92274b, 128)) {
            this.f92281i = abstractC42027a.f92281i;
            this.f92280h = null;
            this.f92274b &= -65;
        }
        if (m92160O(abstractC42027a.f92274b, 256)) {
            this.f92282j = abstractC42027a.f92282j;
        }
        if (m92160O(abstractC42027a.f92274b, 512)) {
            this.f92284l = abstractC42027a.f92284l;
            this.f92283k = abstractC42027a.f92283k;
        }
        if (m92160O(abstractC42027a.f92274b, 1024)) {
            this.f92285m = abstractC42027a.f92285m;
        }
        if (m92160O(abstractC42027a.f92274b, 4096)) {
            this.f92292t = abstractC42027a.f92292t;
        }
        if (m92160O(abstractC42027a.f92274b, 8192)) {
            this.f92288p = abstractC42027a.f92288p;
            this.f92289q = 0;
            this.f92274b &= -16385;
        }
        if (m92160O(abstractC42027a.f92274b, 16384)) {
            this.f92289q = abstractC42027a.f92289q;
            this.f92288p = null;
            this.f92274b &= -8193;
        }
        if (m92160O(abstractC42027a.f92274b, 32768)) {
            this.f92294v = abstractC42027a.f92294v;
        }
        if (m92160O(abstractC42027a.f92274b, 65536)) {
            this.f92287o = abstractC42027a.f92287o;
        }
        if (m92160O(abstractC42027a.f92274b, 131072)) {
            this.f92286n = abstractC42027a.f92286n;
        }
        if (m92160O(abstractC42027a.f92274b, 2048)) {
            this.f92291s.putAll(abstractC42027a.f92291s);
            this.f92298z = abstractC42027a.f92298z;
        }
        if (m92160O(abstractC42027a.f92274b, 524288)) {
            this.f92297y = abstractC42027a.f92297y;
        }
        if (!this.f92287o) {
            this.f92291s.clear();
            int i11 = this.f92274b;
            this.f92286n = false;
            this.f92274b = i11 & (-133121);
            this.f92298z = true;
        }
        this.f92274b |= abstractC42027a.f92274b;
        this.f92290r.m98733d(abstractC42027a.f92290r);
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a0 */
    public T mo92186a0(int i11, int i12) {
        if (this.f92295w) {
            return (T) clone().mo92186a0(i11, i12);
        }
        this.f92284l = i11;
        this.f92283k = i12;
        this.f92274b |= 512;
        return (T) m92199h0();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public T mo92187b() {
        if (this.f92293u && !this.f92295w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f92295w = true;
        return (T) mo92179T();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b0 */
    public T mo92188b0(@DrawableRes int i11) {
        if (this.f92295w) {
            return (T) clone().mo92188b0(i11);
        }
        this.f92281i = i11;
        int i12 = this.f92274b | 128;
        this.f92280h = null;
        this.f92274b = i12 & (-65);
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: c */
    public T mo92189c() {
        return (T) m92209m0(DownsampleStrategy.f6964e, new C4793j());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: c0 */
    public T mo92190c0(@Nullable Drawable drawable) {
        if (this.f92295w) {
            return (T) clone().mo92190c0(drawable);
        }
        this.f92280h = drawable;
        int i11 = this.f92274b | 64;
        this.f92281i = 0;
        this.f92274b = i11 & (-129);
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d */
    public T mo92191d() {
        return (T) m92194e0(DownsampleStrategy.f6963d, new C4794k());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d0 */
    public T mo92192d0(@NonNull Priority priority) {
        if (this.f92295w) {
            return (T) clone().mo92192d0(priority);
        }
        this.f92277e = (Priority) C43363j.m95506d(priority);
        this.f92274b |= 8;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e */
    public T mo92193e() {
        return (T) m92209m0(DownsampleStrategy.f6963d, new C4795l());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC42027a) {
            AbstractC42027a abstractC42027a = (AbstractC42027a) obj;
            if (Float.compare(abstractC42027a.f92275c, this.f92275c) == 0 && this.f92279g == abstractC42027a.f92279g && C43364k.m95511d(this.f92278f, abstractC42027a.f92278f) && this.f92281i == abstractC42027a.f92281i && C43364k.m95511d(this.f92280h, abstractC42027a.f92280h) && this.f92289q == abstractC42027a.f92289q && C43364k.m95511d(this.f92288p, abstractC42027a.f92288p) && this.f92282j == abstractC42027a.f92282j && this.f92283k == abstractC42027a.f92283k && this.f92284l == abstractC42027a.f92284l && this.f92286n == abstractC42027a.f92286n && this.f92287o == abstractC42027a.f92287o && this.f92296x == abstractC42027a.f92296x && this.f92297y == abstractC42027a.f92297y && this.f92276d.equals(abstractC42027a.f92276d) && this.f92277e == abstractC42027a.f92277e && this.f92290r.equals(abstractC42027a.f92290r) && this.f92291s.equals(abstractC42027a.f92291s) && this.f92292t.equals(abstractC42027a.f92292t) && C43364k.m95511d(this.f92285m, abstractC42027a.f92285m) && C43364k.m95511d(this.f92294v, abstractC42027a.f92294v)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f0 */
    public final T m92195f0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull InterfaceC44616h<Bitmap> interfaceC44616h, boolean z11) {
        T t11 = z11 ? (T) m92209m0(downsampleStrategy, interfaceC44616h) : (T) m92184Y(downsampleStrategy, interfaceC44616h);
        t11.f92298z = true;
        return t11;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: g */
    public T mo92196g(@NonNull Class<?> cls) {
        if (this.f92295w) {
            return (T) clone().mo92196g(cls);
        }
        this.f92292t = (Class) C43363j.m95506d(cls);
        this.f92274b |= 4096;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: h */
    public T mo92198h() {
        return (T) mo92201i0(C5368a.f6990j, Boolean.FALSE);
    }

    @NonNull
    /* JADX INFO: renamed from: h0 */
    public final T m92199h0() {
        if (this.f92293u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) m92197g0();
    }

    public int hashCode() {
        return C43364k.m95523p(this.f92294v, C43364k.m95523p(this.f92285m, C43364k.m95523p(this.f92292t, C43364k.m95523p(this.f92291s, C43364k.m95523p(this.f92290r, C43364k.m95523p(this.f92277e, C43364k.m95523p(this.f92276d, C43364k.m95524q(this.f92297y, C43364k.m95524q(this.f92296x, C43364k.m95524q(this.f92287o, C43364k.m95524q(this.f92286n, C43364k.m95522o(this.f92284l, C43364k.m95522o(this.f92283k, C43364k.m95524q(this.f92282j, C43364k.m95523p(this.f92288p, C43364k.m95522o(this.f92289q, C43364k.m95523p(this.f92280h, C43364k.m95522o(this.f92281i, C43364k.m95523p(this.f92278f, C43364k.m95522o(this.f92279g, C43364k.m95519l(this.f92275c)))))))))))))))))))));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: i */
    public T mo92200i(@NonNull AbstractC45352c abstractC45352c) {
        if (this.f92295w) {
            return (T) clone().mo92200i(abstractC45352c);
        }
        this.f92276d = (AbstractC45352c) C43363j.m95506d(abstractC45352c);
        this.f92274b |= 4;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: i0 */
    public <Y> T mo92201i0(@NonNull C44612d<Y> c44612d, @NonNull Y y11) {
        if (this.f92295w) {
            return (T) clone().mo92201i0(c44612d, y11);
        }
        C43363j.m95506d(c44612d);
        C43363j.m95506d(y11);
        this.f92290r.m98734e(c44612d, y11);
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j */
    public T mo92202j() {
        if (this.f92295w) {
            return (T) clone().mo92202j();
        }
        this.f92291s.clear();
        int i11 = this.f92274b;
        this.f92286n = false;
        this.f92287o = false;
        this.f92274b = (i11 & (-133121)) | 65536;
        this.f92298z = true;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j0 */
    public T mo92203j0(@NonNull InterfaceC44610b interfaceC44610b) {
        if (this.f92295w) {
            return (T) clone().mo92203j0(interfaceC44610b);
        }
        this.f92285m = (InterfaceC44610b) C43363j.m95506d(interfaceC44610b);
        this.f92274b |= 1024;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: k */
    public T mo92204k(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) mo92201i0(DownsampleStrategy.f6967h, C43363j.m95506d(downsampleStrategy));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: k0 */
    public T mo92205k0(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (this.f92295w) {
            return (T) clone().mo92205k0(f11);
        }
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f92275c = f11;
        this.f92274b |= 2;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l */
    public T mo92206l(@NonNull Bitmap.CompressFormat compressFormat) {
        return (T) mo92201i0(C4784c.f4803c, C43363j.m95506d(compressFormat));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l0 */
    public T mo92207l0(boolean z11) {
        if (this.f92295w) {
            return (T) clone().mo92207l0(true);
        }
        this.f92282j = !z11;
        this.f92274b |= 256;
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m */
    public T mo92208m(@DrawableRes int i11) {
        if (this.f92295w) {
            return (T) clone().mo92208m(i11);
        }
        this.f92279g = i11;
        int i12 = this.f92274b | 32;
        this.f92278f = null;
        this.f92274b = i12 & (-17);
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m0 */
    public final T m92209m0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        if (this.f92295w) {
            return (T) clone().m92209m0(downsampleStrategy, interfaceC44616h);
        }
        mo92204k(downsampleStrategy);
        return (T) mo92213o0(interfaceC44616h);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: n */
    public T mo92210n(@Nullable Drawable drawable) {
        if (this.f92295w) {
            return (T) clone().mo92210n(drawable);
        }
        this.f92278f = drawable;
        int i11 = this.f92274b | 16;
        this.f92279g = 0;
        this.f92274b = i11 & (-33);
        return (T) m92199h0();
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public <Y> T m92211n0(@NonNull Class<Y> cls, @NonNull InterfaceC44616h<Y> interfaceC44616h, boolean z11) {
        if (this.f92295w) {
            return (T) clone().m92211n0(cls, interfaceC44616h, z11);
        }
        C43363j.m95506d(cls);
        C43363j.m95506d(interfaceC44616h);
        this.f92291s.put(cls, interfaceC44616h);
        int i11 = this.f92274b;
        this.f92287o = true;
        this.f92274b = 67584 | i11;
        this.f92298z = false;
        if (z11) {
            this.f92274b = i11 | 198656;
            this.f92286n = true;
        }
        return (T) m92199h0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o */
    public T mo92212o() {
        return (T) m92194e0(DownsampleStrategy.f6962c, new C4804u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: p0 */
    public T m92215p0(@NonNull InterfaceC44616h<Bitmap> interfaceC44616h, boolean z11) {
        if (this.f92295w) {
            return (T) clone().m92215p0(interfaceC44616h, z11);
        }
        C4802s c4802s = new C4802s(interfaceC44616h, z11);
        m92211n0(Bitmap.class, interfaceC44616h, z11);
        m92211n0(Drawable.class, c4802s, z11);
        m92211n0(BitmapDrawable.class, c4802s.m4894c(), z11);
        m92211n0(C37790c.class, new C37793f(interfaceC44616h), z11);
        return (T) m92199h0();
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final AbstractC45352c m92216q() {
        return this.f92276d;
    }

    /* JADX INFO: renamed from: r */
    public final int m92218r() {
        return this.f92279g;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: r0 */
    public T mo92219r0(boolean z11) {
        if (this.f92295w) {
            return (T) clone().mo92219r0(z11);
        }
        this.f92273A = z11;
        this.f92274b |= 1048576;
        return (T) m92199h0();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Drawable m92220s() {
        return this.f92278f;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Drawable m92221t() {
        return this.f92288p;
    }

    /* JADX INFO: renamed from: u */
    public final int m92222u() {
        return this.f92289q;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m92223v() {
        return this.f92297y;
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public final C44613e m92224w() {
        return this.f92290r;
    }

    /* JADX INFO: renamed from: x */
    public final int m92225x() {
        return this.f92283k;
    }

    /* JADX INFO: renamed from: y */
    public final int m92226y() {
        return this.f92284l;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Drawable m92227z() {
        return this.f92280h;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Z */
    public T m92185Z(int i11) {
        return (T) mo92186a0(i11, i11);
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: f */
    public T mo6607f() {
        try {
            T t11 = (T) super.clone();
            C44613e c44613e = new C44613e();
            t11.f92290r = c44613e;
            c44613e.m98733d(this.f92290r);
            C43355b c43355b = new C43355b();
            t11.f92291s = c43355b;
            c43355b.putAll(this.f92291s);
            t11.f92293u = false;
            t11.f92295w = false;
            return t11;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: p */
    public T mo92214p(@NonNull DecodeFormat decodeFormat) {
        C43363j.m95506d(decodeFormat);
        return (T) mo92201i0(C5368a.f6986f, decodeFormat).mo92201i0(C37796i.f85153a, decodeFormat);
    }

    /* JADX INFO: renamed from: g0 */
    public final T m92197g0() {
        return this;
    }
}
