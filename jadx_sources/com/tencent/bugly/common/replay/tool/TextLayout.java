package com.tencent.bugly.common.replay.tool;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/tool/TextLayout;", "", "dominantTextColor", "", "getDominantTextColor", "()Ljava/lang/Integer;", "lineCount", "getLineCount", "()I", "getEllipsisCount", "line", "getLineBottom", "getLineStart", "getLineTop", "getLineVisibleEnd", "getPrimaryHorizontal", "", TypedValues.CycleType.S_WAVE_OFFSET, "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface TextLayout {
    @Nullable
    Integer getDominantTextColor();

    int getEllipsisCount(int line);

    int getLineBottom(int line);

    int getLineCount();

    int getLineStart(int line);

    int getLineTop(int line);

    int getLineVisibleEnd(int line);

    float getPrimaryHorizontal(int line, int offset);
}
