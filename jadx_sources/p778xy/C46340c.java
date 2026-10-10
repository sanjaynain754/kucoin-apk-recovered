package p778xy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.File;
import p419l2.AbstractC42027a;
import p419l2.InterfaceC42031e;
import p628t1.C44612d;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;

/* JADX INFO: renamed from: xy.c */
/* JADX INFO: compiled from: GlideRequest.java */
/* JADX INFO: loaded from: classes12.dex */
public class C46340c<TranscodeType> extends C5313g<TranscodeType> implements Cloneable {
    public C46340c(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull ComponentCallbacks2C5314h componentCallbacks2C5314h, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(componentCallbacks2C5309c, componentCallbacks2C5314h, cls, context);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6608s0(@Nullable InterfaceC42031e<TranscodeType> interfaceC42031e) {
        return (C46340c) super.mo6608s0(interfaceC42031e);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6606a(@NonNull AbstractC42027a<?> abstractC42027a) {
        return (C46340c) super.mo6606a(abstractC42027a);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92189c() {
        return (C46340c) super.mo92189c();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92191d() {
        return (C46340c) super.mo92191d();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: U0 */
    public C46340c<TranscodeType> m102188U0() {
        return (C46340c) super.mo92193e();
    }

    @Override // com.bumptech.glide.C5313g
    @CheckResult
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> clone() {
        return (C46340c) super.clone();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92196g(@NonNull Class<?> cls) {
        return (C46340c) super.mo92196g(cls);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92200i(@NonNull AbstractC45352c abstractC45352c) {
        return (C46340c) super.mo92200i(abstractC45352c);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92202j() {
        return (C46340c) super.mo92202j();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92204k(@NonNull DownsampleStrategy downsampleStrategy) {
        return (C46340c) super.mo92204k(downsampleStrategy);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92208m(@DrawableRes int i11) {
        return (C46340c) super.mo92208m(i11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92210n(@Nullable Drawable drawable) {
        return (C46340c) super.mo92210n(drawable);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6614y0(@Nullable C5313g<TranscodeType> c5313g) {
        return (C46340c) super.mo6614y0(c5313g);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92212o() {
        return (C46340c) super.mo92212o();
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6596G0(@Nullable InterfaceC42031e<TranscodeType> interfaceC42031e) {
        return (C46340c) super.mo6596G0(interfaceC42031e);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6597H0(@Nullable Uri uri) {
        return (C46340c) super.mo6597H0(uri);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6598I0(@Nullable File file) {
        return (C46340c) super.mo6598I0(file);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6599J0(@Nullable @DrawableRes @RawRes Integer num) {
        return (C46340c) super.mo6599J0(num);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6600K0(@Nullable Object obj) {
        return (C46340c) super.mo6600K0(obj);
    }

    @Override // com.bumptech.glide.C5313g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo6601L0(@Nullable String str) {
        return (C46340c) super.mo6601L0(str);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92179T() {
        return (C46340c) super.mo92179T();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92180U() {
        return (C46340c) super.mo92180U();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92181V() {
        return (C46340c) super.mo92181V();
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92182W() {
        return (C46340c) super.mo92182W();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o1 */
    public C46340c<TranscodeType> m102208o1(int i11) {
        return (C46340c) super.m92185Z(i11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92186a0(int i11, int i12) {
        return (C46340c) super.mo92186a0(i11, i12);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92188b0(@DrawableRes int i11) {
        return (C46340c) super.mo92188b0(i11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92190c0(@Nullable Drawable drawable) {
        return (C46340c) super.mo92190c0(drawable);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92192d0(@NonNull Priority priority) {
        return (C46340c) super.mo92192d0(priority);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public <Y> C46340c<TranscodeType> mo92201i0(@NonNull C44612d<Y> c44612d, @NonNull Y y11) {
        return (C46340c) super.mo92201i0(c44612d, y11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92203j0(@NonNull InterfaceC44610b interfaceC44610b) {
        return (C46340c) super.mo92203j0(interfaceC44610b);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92205k0(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return (C46340c) super.mo92205k0(f11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92207l0(boolean z11) {
        return (C46340c) super.mo92207l0(z11);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92213o0(@NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        return (C46340c) super.mo92213o0(interfaceC44616h);
    }

    @Override // p419l2.AbstractC42027a
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public C46340c<TranscodeType> mo92219r0(boolean z11) {
        return (C46340c) super.mo92219r0(z11);
    }
}
