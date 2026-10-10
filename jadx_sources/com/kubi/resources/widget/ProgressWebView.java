package com.kubi.resources.widget;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.kubi.sdk.res.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class ProgressWebView extends WebView {

    /* JADX INFO: renamed from: b */
    public ProgressBar f43997b;

    /* JADX INFO: renamed from: com.kubi.resources.widget.ProgressWebView$a */
    public static class C22940a extends WebChromeClient {

        /* JADX INFO: renamed from: a */
        public ProgressBar f43998a;

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            if (i11 == 100) {
                this.f43998a.setVisibility(8);
            } else {
                if (this.f43998a.getVisibility() == 8) {
                    this.f43998a.setVisibility(0);
                }
                this.f43998a.setProgress(i11);
            }
            super.onProgressChanged(webView, i11);
        }
    }

    public ProgressWebView(Context context) {
        super(context);
        m54719a();
    }

    /* JADX INFO: renamed from: a */
    public final void m54719a() {
        this.f43997b = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
        this.f43997b.setLayoutParams(new LinearLayout.LayoutParams(-1, 8));
        this.f43997b.getProgressDrawable().setColorFilter(getResources().getColor(R$color.primary), PorterDuff.Mode.SRC_ATOP);
        addView(this.f43997b);
        setWebChromeClient(new C22940a());
    }

    public ProgressBar getProgressBar() {
        return this.f43997b;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) this.f43997b.getLayoutParams();
        layoutParams.x = i11;
        layoutParams.y = i12;
        this.f43997b.setLayoutParams(layoutParams);
        super.onScrollChanged(i11, i12, i13, i14);
    }

    public ProgressWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m54719a();
    }

    public ProgressWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54719a();
    }
}
