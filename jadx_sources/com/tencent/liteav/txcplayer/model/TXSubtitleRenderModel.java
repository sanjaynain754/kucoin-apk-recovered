package com.tencent.liteav.txcplayer.model;

/* JADX INFO: loaded from: classes59.dex */
public class TXSubtitleRenderModel {
    public int canvasHeight;
    public int canvasWidth;
    public float endMargin;
    public String familyName;
    public int fontColor;
    public float fontScale;
    public float fontSize;
    public boolean isBondFontStyle;
    public float lineSpace;
    public int outlineColor;
    public float outlineWidth;
    public float startMargin;
    public float verticalMargin;

    public String toString() {
        return "TXSubtitleRenderModel{canvasWidth=" + this.canvasWidth + ", canvasHeight=" + this.canvasHeight + ", familyName='" + this.familyName + ", fontSize=" + this.fontSize + ", fontScale=" + this.fontScale + ", fontColor=" + this.fontColor + ", isBondFontStyle=" + this.isBondFontStyle + ", outlineWidth=" + this.outlineWidth + ", outlineColor=" + this.outlineColor + ", lineSpace=" + this.lineSpace + ", startMargin=" + this.startMargin + ", endMargin=" + this.endMargin + ", verticalMargin=" + this.verticalMargin + '}';
    }
}
