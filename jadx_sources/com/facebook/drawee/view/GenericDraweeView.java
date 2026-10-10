package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import p192d6.C36621b;
import p584r4.C43921a;
import p584r4.C43922b;
import p584r4.C43923c;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class GenericDraweeView extends DraweeView<C43921a> {
    public GenericDraweeView(Context context, C43921a c43921a) {
        super(context);
        setHierarchy(c43921a);
    }

    public GenericDraweeView(Context context) throws Throwable {
        super(context);
        inflateHierarchy(context, null);
    }

    public void inflateHierarchy(Context context, AttributeSet attributeSet) throws Throwable {
        if (C36621b.m81959d()) {
            C36621b.m81957a("GenericDraweeView#inflateHierarchy");
        }
        C43922b c43922bM96824d = C43923c.m96824d(context, attributeSet);
        setAspectRatio(c43922bM96824d.m96801f());
        setHierarchy(c43922bM96824d.m96796a());
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i11) throws Throwable {
        super(context, attributeSet, i11);
        inflateHierarchy(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i11, int i12) throws Throwable {
        super(context, attributeSet, i11, i12);
        inflateHierarchy(context, attributeSet);
    }
}
