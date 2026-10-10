package com.tencent.rtmp.p148ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes56.dex */
public class TXSubtitleView extends RelativeLayout {
    private static final String TAG = "TXSubtitleView";
    private Handler mMainHandler;
    private ImageView mSubtitleIV;

    public TXSubtitleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mSubtitleIV = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.mSubtitleIV, layoutParams);
    }

    public TXSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.mMainHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void show(final Bitmap bitmap) {
        LiteavLog.m76087i(TAG, "[show] subtitleBitmap =".concat(String.valueOf(bitmap)));
        runOnUIThread(new Runnable() { // from class: com.tencent.rtmp.ui.TXSubtitleView.1
            @Override // java.lang.Runnable
            public final void run() {
                TXSubtitleView.this.mSubtitleIV.setImageBitmap(bitmap);
            }
        });
    }

    public TXSubtitleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        init();
    }

    public TXSubtitleView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        init();
    }
}
