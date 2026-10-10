package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;
import p193d7.AbstractC36629b;
import p193d7.AbstractC36631d;
import p193d7.InterfaceC36628a;
import p193d7.InterfaceC36634g;
import p224e7.InterfaceC37085a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC37085a
public abstract class YogaNodeJNIBase extends AbstractC6262a implements Cloneable {

    @InterfaceC37085a
    private float[] arr;

    /* JADX INFO: renamed from: b */
    public YogaNodeJNIBase f9974b;

    /* JADX INFO: renamed from: c */
    public AbstractC36629b f9975c;

    /* JADX INFO: renamed from: d */
    public List<YogaNodeJNIBase> f9976d;

    /* JADX INFO: renamed from: e */
    public InterfaceC36634g f9977e;

    /* JADX INFO: renamed from: f */
    public InterfaceC36628a f9978f;

    /* JADX INFO: renamed from: g */
    public long f9979g;

    /* JADX INFO: renamed from: h */
    public Object f9980h;

    /* JADX INFO: renamed from: i */
    public boolean f9981i;

    @InterfaceC37085a
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j11) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f9981i = true;
        if (j11 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f9979g = j11;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: b */
    public void mo10716b(float f11, float f12) {
        m10737l0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i11);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f9976d;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m10737l0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i12 = 0; i12 < yogaNodeJNIBaseArr.length; i12++) {
            jArr[i12] = yogaNodeJNIBaseArr[i12].f9979g;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f9979g, f11, f12, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: s */
    public void mo10746s() {
        this.f9977e = null;
        this.f9978f = null;
        this.f9980h = null;
        this.arr = null;
        this.f9981i = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f9979g);
    }

    /* JADX INFO: renamed from: com.facebook.yoga.YogaNodeJNIBase$a */
    public static /* synthetic */ class C6260a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9982a;

        static {
            int[] iArr = new int[YogaEdge.values().length];
            f9982a = iArr;
            try {
                iArr[YogaEdge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9982a[YogaEdge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9982a[YogaEdge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9982a[YogaEdge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9982a[YogaEdge.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9982a[YogaEdge.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static YogaValue m10687o0(long j11) {
        return new YogaValue(Float.intBitsToFloat((int) j11), (int) (j11 >> 32));
    }

    @InterfaceC37085a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i11) {
        List<YogaNodeJNIBase> list = this.f9976d;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i11);
        this.f9976d.add(i11, yogaNodeJNIBase);
        yogaNodeJNIBase.f9974b = this;
        return yogaNodeJNIBase.f9979g;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: A */
    public void mo10688A(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f9979g, yogaDirection.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: B */
    public void mo10689B(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f9979g, yogaDisplay.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: C */
    public void mo10690C(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: D */
    public void mo10691D(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: E */
    public void mo10692E() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: F */
    public void mo10693F(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: G */
    public void mo10694G(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f9979g, yogaFlexDirection.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: H */
    public void mo10695H(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: I */
    public void mo10696I(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: J */
    public void mo10697J(YogaGutter yogaGutter, float f11) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f9979g, yogaGutter.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: K */
    public void mo10698K(YogaGutter yogaGutter, float f11) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f9979g, yogaGutter.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: L */
    public void mo10699L(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: M */
    public void mo10700M() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: N */
    public void mo10701N(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: O */
    public void mo10702O(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f9979g, yogaJustify.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: P */
    public void mo10703P(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: Q */
    public void mo10704Q(YogaEdge yogaEdge) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f9979g, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: R */
    public void mo10705R(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: S */
    public void mo10706S(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: T */
    public void mo10707T(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: U */
    public void mo10708U(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: V */
    public void mo10709V(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: W */
    public void mo10710W(InterfaceC36634g interfaceC36634g) {
        this.f9977e = interfaceC36634g;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f9979g, interfaceC36634g != null);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: X */
    public void mo10711X(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: Y */
    public void mo10712Y(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: Z */
    public void mo10713Z(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: a */
    public void mo10714a(AbstractC6262a abstractC6262a, int i11) {
        if (abstractC6262a instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC6262a;
            if (yogaNodeJNIBase.f9974b != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f9976d == null) {
                this.f9976d = new ArrayList(4);
            }
            this.f9976d.add(i11, yogaNodeJNIBase);
            yogaNodeJNIBase.f9974b = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f9979g, yogaNodeJNIBase.f9979g, i11);
        }
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: a0 */
    public void mo10715a0(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: b0 */
    public void mo10717b0(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f9979g, yogaOverflow.intValue());
    }

    @InterfaceC37085a
    public final float baseline(float f11, float f12) {
        return this.f9978f.baseline(this, f11, f12);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: c */
    public void mo10718c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: c0 */
    public void mo10719c0(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: d */
    public float mo10720d() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: d0 */
    public void mo10721d0(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: e */
    public YogaValue mo10722e() {
        return m10687o0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f9979g));
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: e0 */
    public void mo10723e0(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: f */
    public YogaDirection mo10724f() {
        float[] fArr = this.arr;
        return YogaDirection.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: f0 */
    public void mo10725f0(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: g */
    public float mo10726g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: g0 */
    public void mo10727g0(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f9979g, yogaPositionType.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: h */
    public float mo10728h(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f11 = fArr[0];
        if ((((int) f11) & 2) != 2) {
            return 0.0f;
        }
        int i11 = (((int) f11) & 1) != 1 ? 4 : 0;
        int i12 = 10 - i11;
        switch (C6260a.f9982a[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i12];
            case 2:
                return this.arr[11 - i11];
            case 3:
                return this.arr[12 - i11];
            case 4:
                return this.arr[13 - i11];
            case 5:
                return mo10724f() == YogaDirection.RTL ? this.arr[12 - i11] : this.arr[i12];
            case 6:
                return mo10724f() == YogaDirection.RTL ? this.arr[i12] : this.arr[12 - i11];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: h0 */
    public void mo10729h0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: i */
    public float mo10730i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: i0 */
    public void mo10731i0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: j */
    public float mo10732j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: j0 */
    public void mo10733j0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: k */
    public float mo10734k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: k0 */
    public void mo10735k0(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f9979g, yogaWrap.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: l */
    public YogaValue mo10736l(YogaEdge yogaEdge) {
        return m10687o0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f9979g, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: m */
    public YogaValue mo10738m() {
        return m10687o0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f9979g));
    }

    /* JADX INFO: renamed from: m0 */
    public Object m10739m0() {
        return this.f9980h;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: n */
    public boolean mo10740n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f9981i;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase mo10745r(int i11) {
        List<YogaNodeJNIBase> list = this.f9976d;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i11);
        yogaNodeJNIBaseRemove.f9974b = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f9979g, yogaNodeJNIBaseRemove.f9979g);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: o */
    public boolean mo10742o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f9979g);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: p */
    public boolean mo10743p() {
        return this.f9977e != null;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: q */
    public void mo10744q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f9981i = false;
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: t */
    public void mo10747t(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f9979g, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: u */
    public void mo10748u(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f9979g, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: v */
    public void mo10749v(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f9979g, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: w */
    public void mo10750w(float f11) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f9979g, f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: x */
    public void mo10751x(InterfaceC36628a interfaceC36628a) {
        this.f9978f = interfaceC36628a;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f9979g, interfaceC36628a != null);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: y */
    public void mo10752y(YogaEdge yogaEdge, float f11) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f9979g, yogaEdge.intValue(), f11);
    }

    @Override // com.facebook.yoga.AbstractC6262a
    /* JADX INFO: renamed from: z */
    public void mo10753z(Object obj) {
        this.f9980h = obj;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10737l0(AbstractC6262a abstractC6262a) {
        Object objM10739m0 = m10739m0();
        if (objM10739m0 instanceof AbstractC6262a.a) {
            ((AbstractC6262a.a) objM10739m0).m10759a(this, abstractC6262a);
        }
    }

    @InterfaceC37085a
    public final long measure(float f11, int i11, float f12, int i12) {
        if (mo10743p()) {
            return this.f9977e.measure(this, f11, YogaMeasureMode.fromInt(i11), f12, YogaMeasureMode.fromInt(i12));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    public YogaNodeJNIBase(AbstractC36629b abstractC36629b) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((AbstractC36631d) abstractC36629b).f79440a));
        this.f9975c = abstractC36629b;
    }
}
