package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.blankj.utilcode.util.ReflectUtils;
import com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar;

/* JADX INFO: loaded from: classes13.dex */
public class LeverSeekBar extends BubbleSeekBar {

    /* JADX INFO: renamed from: b */
    public final int[] f43897b;

    /* JADX INFO: renamed from: c */
    public InterfaceC22927a f43898c;

    /* JADX INFO: renamed from: com.kubi.resources.widget.LeverSeekBar$a */
    public interface InterfaceC22927a {
        /* JADX INFO: renamed from: a */
        void mo40279a(int[] iArr);
    }

    public LeverSeekBar(Context context) {
        super(context);
        this.f43897b = new int[]{0, 0};
    }

    public void setWindowProvider(InterfaceC22927a interfaceC22927a) {
        this.f43898c = interfaceC22927a;
    }

    public LeverSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43897b = new int[]{0, 0};
    }

    @Override // android.view.View
    public void getLocationInWindow(int[] iArr) {
        super.getLocationInWindow(iArr);
        InterfaceC22927a interfaceC22927a = this.f43898c;
        if (interfaceC22927a != null) {
            interfaceC22927a.mo40279a(this.f43897b);
        }
        int i11 = iArr[0];
        int[] iArr2 = this.f43897b;
        iArr[0] = i11 + iArr2[0];
        iArr[1] = iArr[1] + iArr2[1];
    }

    @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar
    public int getProgress() {
        int progress = super.getProgress();
        if (progress < 1) {
            return 1;
        }
        return progress;
    }

    @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar
    public float getProgressFloat() {
        float progressFloat = super.getProgressFloat();
        if (progressFloat < 1.0f) {
            return 1.0f;
        }
        return progressFloat;
    }

    @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ReflectUtils.m6074o(this).m6078e("isAlwaysShowBubble", Boolean.TRUE);
            correctOffsetWhenContainerOnScrolling();
            ReflectUtils.m6074o(this).m6078e("isAlwaysShowBubble", Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public LeverSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43897b = new int[]{0, 0};
    }
}
