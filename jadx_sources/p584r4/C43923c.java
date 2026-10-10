package p584r4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.R$styleable;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.drawee.drawable.RunnableC5576b;
import com.facebook.drawee.generic.RoundingParams;
import p192d6.C36621b;

/* JADX INFO: renamed from: r4.c */
/* JADX INFO: compiled from: GenericDraweeHierarchyInflater.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43923c {
    /* JADX INFO: renamed from: a */
    public static Drawable m96821a(Context context, TypedArray typedArray, int i11) {
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC5597q m96823c(TypedArray typedArray, int i11) {
        switch (typedArray.getInt(i11, -2)) {
            case -1:
                return null;
            case 0:
                return InterfaceC5597q.f8351a;
            case 1:
                return InterfaceC5597q.f8354d;
            case 2:
                return InterfaceC5597q.f8355e;
            case 3:
                return InterfaceC5597q.f8356f;
            case 4:
                return InterfaceC5597q.f8357g;
            case 5:
                return InterfaceC5597q.f8358h;
            case 6:
                return InterfaceC5597q.f8359i;
            case 7:
                return InterfaceC5597q.f8360j;
            case 8:
                return InterfaceC5597q.f8361k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public static C43922b m96825e(C43922b c43922b, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.GenericDraweeHierarchy);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i13 = 0;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z21 = true;
                boolean z22 = true;
                boolean z23 = true;
                boolean z24 = true;
                int dimensionPixelSize = 0;
                while (i13 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i13);
                        if (index == R$styleable.GenericDraweeHierarchy_actualImageScaleType) {
                            c43922b.m96816v(m96823c(typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_placeholderImage) {
                            c43922b.m96787C(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_pressedStateOverlayImage) {
                            c43922b.m96789E(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_progressBarImage) {
                            c43922b.m96790F(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_fadeDuration) {
                            c43922b.m96819y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R$styleable.GenericDraweeHierarchy_viewAspectRatio) {
                            c43922b.m96818x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == R$styleable.GenericDraweeHierarchy_placeholderImageScaleType) {
                            c43922b.m96788D(m96823c(typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_retryImage) {
                            c43922b.m96792H(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_retryImageScaleType) {
                            c43922b.m96793I(m96823c(typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_failureImage) {
                            c43922b.m96820z(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_failureImageScaleType) {
                            c43922b.m96785A(m96823c(typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_progressBarImageScaleType) {
                            c43922b.m96791G(m96823c(typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == R$styleable.GenericDraweeHierarchy_backgroundImage) {
                            c43922b.m96817w(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_overlayImage) {
                            c43922b.m96786B(m96821a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == R$styleable.GenericDraweeHierarchy_roundAsCircle) {
                            m96822b(c43922b).m8724t(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == R$styleable.GenericDraweeHierarchy_roundedCornerRadius) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i14 = dimensionPixelSize;
                            if (index == R$styleable.GenericDraweeHierarchy_roundTopLeft) {
                                z16 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundTopRight) {
                                z18 = typedArrayObtainStyledAttributes.getBoolean(index, z18);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundBottomLeft) {
                                z23 = typedArrayObtainStyledAttributes.getBoolean(index, z23);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundBottomRight) {
                                z21 = typedArrayObtainStyledAttributes.getBoolean(index, z21);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundTopStart) {
                                z17 = typedArrayObtainStyledAttributes.getBoolean(index, z17);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundTopEnd) {
                                z19 = typedArrayObtainStyledAttributes.getBoolean(index, z19);
                            } else if (index == R$styleable.GenericDraweeHierarchy_roundBottomStart) {
                                z24 = typedArrayObtainStyledAttributes.getBoolean(index, z24);
                            } else {
                                if (index == R$styleable.GenericDraweeHierarchy_roundBottomEnd) {
                                    z22 = typedArrayObtainStyledAttributes.getBoolean(index, z22);
                                } else if (index == R$styleable.GenericDraweeHierarchy_roundWithOverlayColor) {
                                    dimensionPixelSize = i14;
                                    m96822b(c43922b).m8721q(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i14;
                                    if (index == R$styleable.GenericDraweeHierarchy_roundingBorderWidth) {
                                        m96822b(c43922b).m8718n(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == R$styleable.GenericDraweeHierarchy_roundingBorderColor) {
                                        m96822b(c43922b).m8717m(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == R$styleable.GenericDraweeHierarchy_roundingBorderPadding) {
                                        m96822b(c43922b).m8722r(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                }
                                i13++;
                                context2 = context;
                            }
                            dimensionPixelSize = i14;
                        }
                        i13++;
                        context2 = context;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z25 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z15 = z16 && z19;
                    z11 = z18 && z17;
                    z12 = z21 && z24;
                    if (z23 && z22) {
                        z25 = true;
                    }
                } else {
                    z15 = z16 && z17;
                    z11 = z18 && z19;
                    z12 = z21 && z22;
                    if (z23 && z24) {
                        z25 = true;
                    }
                }
                z14 = z25;
                i11 = integer;
                z13 = z15;
                i12 = dimensionPixelSize;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            z11 = true;
            i11 = 0;
            z12 = true;
            z13 = true;
            z14 = true;
            i12 = 0;
        }
        if (c43922b.m96809n() != null && i11 > 0) {
            c43922b.m96790F(new RunnableC5576b(c43922b.m96809n(), i11));
        }
        if (i12 > 0) {
            m96822b(c43922b).m8719o(z13 ? i12 : 0.0f, z11 ? i12 : 0.0f, z12 ? i12 : 0.0f, z14 ? i12 : 0.0f);
        }
        return c43922b;
    }

    /* JADX INFO: renamed from: b */
    public static RoundingParams m96822b(C43922b c43922b) {
        if (c43922b.m96814s() == null) {
            c43922b.m96794J(new RoundingParams());
        }
        return c43922b.m96814s();
    }

    /* JADX INFO: renamed from: d */
    public static C43922b m96824d(Context context, AttributeSet attributeSet) throws Throwable {
        if (C36621b.m81959d()) {
            C36621b.m81957a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        C43922b c43922bM96825e = m96825e(new C43922b(context.getResources()), context, attributeSet);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        return c43922bM96825e;
    }
}
