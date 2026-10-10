package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.drawee.R$styleable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import p190d4.C36613d;
import p192d6.C36621b;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class SimpleDraweeView extends GenericDraweeView {

    /* JADX INFO: renamed from: c */
    public static InterfaceC45711k<? extends AbstractDraweeControllerBuilder> f8383c;

    /* JADX INFO: renamed from: b */
    public AbstractDraweeControllerBuilder f8384b;

    public SimpleDraweeView(Context context) {
        super(context);
        m8738a(context, null);
    }

    public void setActualImageResource(@DrawableRes int i11) {
        m8739c(i11, null);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        m8740d(uri, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m8737b(InterfaceC45711k<? extends AbstractDraweeControllerBuilder> interfaceC45711k) {
        f8383c = interfaceC45711k;
    }

    /* JADX INFO: renamed from: d */
    public void m8740d(Uri uri, Object obj) {
        setController(this.f8384b.m8611B(obj).mo89569b(uri).mo8617a(getController()).build());
    }

    /* JADX INFO: renamed from: e */
    public void m8741e(String str, Object obj) {
        m8740d(str != null ? Uri.parse(str) : null, obj);
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.f8384b;
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.f8384b.m8613D(imageRequest).mo8617a(getController()).build());
    }

    public void setImageURI(String str) {
        m8741e(str, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8738a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m8738a(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C45708h.m100897h(f8383c, "SimpleDraweeView was not initialized!");
                this.f8384b = f8383c.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleDraweeView);
                try {
                    int i11 = R$styleable.SimpleDraweeView_actualImageUri;
                    if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                        m8740d(Uri.parse(typedArrayObtainStyledAttributes.getString(i11)), null);
                    } else {
                        int i12 = R$styleable.SimpleDraweeView_actualImageResource;
                        if (typedArrayObtainStyledAttributes.hasValue(i12) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, -1)) != -1) {
                            if (isInEditMode()) {
                                setImageResource(resourceId);
                            } else {
                                setActualImageResource(resourceId);
                            }
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } catch (Throwable th3) {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8739c(@DrawableRes int i11, Object obj) {
        m8740d(C36613d.m81939h(i11), obj);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m8738a(context, attributeSet);
    }
}
