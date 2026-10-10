package com.sensorsdata.analytics.android.sdk.visual.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class WebNode implements Serializable {
    private static final long serialVersionUID = -5865016149609340219L;
    private String $element_content;
    private String $element_selector;
    private String $title;
    private String $url;
    private float height;

    /* JADX INFO: renamed from: id */
    private String f56494id;
    private float left;
    private float scale;
    private float scrollX;
    private float scrollY;
    private List<String> subelements;
    private String tagName;
    private float top;
    private boolean visibility;
    private float width;
    private int zIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebNode)) {
            return false;
        }
        WebNode webNode = (WebNode) obj;
        if (Float.compare(webNode.getTop(), getTop()) != 0 || Float.compare(webNode.getLeft(), getLeft()) != 0 || Float.compare(webNode.getWidth(), getWidth()) != 0 || Float.compare(webNode.getHeight(), getHeight()) != 0 || isVisibility() != webNode.isVisibility() || Float.compare(webNode.getScrollX(), getScrollX()) != 0 || Float.compare(webNode.getScrollY(), getScrollY()) != 0 || Float.compare(webNode.getScale(), getScale()) != 0 || getzIndex() != webNode.getzIndex() || !getId().equals(webNode.getId())) {
            return false;
        }
        if (getTagName() == null ? webNode.getTagName() != null : !getTagName().equals(webNode.getTagName())) {
            return false;
        }
        if (get$element_selector() == null ? webNode.get$element_selector() != null : !get$element_selector().equals(webNode.get$element_selector())) {
            return false;
        }
        if (get$element_content() == null ? webNode.get$element_content() != null : !get$element_content().equals(webNode.get$element_content())) {
            return false;
        }
        if (get$title() == null ? webNode.get$title() != null : !get$title().equals(webNode.get$title())) {
            return false;
        }
        if (get$url() == null ? webNode.get$url() != null : !get$url().equals(webNode.get$url())) {
            return false;
        }
        if (getSubelements() != null) {
            return getSubelements().equals(webNode.getSubelements());
        }
        return webNode.getSubelements() == null;
    }

    public String get$element_content() {
        return this.$element_content;
    }

    public String get$element_selector() {
        return this.$element_selector;
    }

    public String get$title() {
        return this.$title;
    }

    public String get$url() {
        return this.$url;
    }

    public float getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f56494id;
    }

    public float getLeft() {
        return this.left;
    }

    public float getScale() {
        return this.scale;
    }

    public float getScrollX() {
        return this.scrollX;
    }

    public float getScrollY() {
        return this.scrollY;
    }

    public List<String> getSubelements() {
        return this.subelements;
    }

    public String getTagName() {
        return this.tagName;
    }

    public float getTop() {
        return this.top;
    }

    public float getWidth() {
        return this.width;
    }

    public int getzIndex() {
        return this.zIndex;
    }

    public boolean isVisibility() {
        return this.visibility;
    }

    public void set$element_content(String str) {
        this.$element_content = str;
    }

    public void set$element_selector(String str) {
        this.$element_selector = str;
    }

    public void set$title(String str) {
        this.$title = str;
    }

    public void set$url(String str) {
        this.$url = str;
    }

    public void setHeight(float f11) {
        this.height = f11;
    }

    public void setId(String str) {
        this.f56494id = str;
    }

    public void setLeft(float f11) {
        this.left = f11;
    }

    public void setScale(float f11) {
        this.scale = f11;
    }

    public void setScrollX(float f11) {
        this.scrollX = f11;
    }

    public void setScrollY(float f11) {
        this.scrollY = f11;
    }

    public void setSubelements(List<String> list) {
        this.subelements = list;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    public void setTop(float f11) {
        this.top = f11;
    }

    public void setVisibility(boolean z11) {
        this.visibility = z11;
    }

    public void setWidth(float f11) {
        this.width = f11;
    }

    public void setzIndex(int i11) {
        this.zIndex = i11;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iFloatToIntBits;
        int iFloatToIntBits2;
        int iFloatToIntBits3;
        int iFloatToIntBits4;
        int iFloatToIntBits5;
        int iFloatToIntBits6;
        int iFloatToIntBits7;
        int iHashCode5;
        int iHashCode6 = getId().hashCode() * 31;
        int iHashCode7 = 0;
        if (getTagName() != null) {
            iHashCode = getTagName().hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = (iHashCode6 + iHashCode) * 31;
        if (get$element_selector() != null) {
            iHashCode2 = get$element_selector().hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        if (get$element_content() != null) {
            iHashCode3 = get$element_content().hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i13 = (i12 + iHashCode3) * 31;
        if (get$title() != null) {
            iHashCode4 = get$title().hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i14 = (i13 + iHashCode4) * 31;
        if (getTop() != 0.0f) {
            iFloatToIntBits = Float.floatToIntBits(getTop());
        } else {
            iFloatToIntBits = 0;
        }
        int i15 = (i14 + iFloatToIntBits) * 31;
        if (getLeft() != 0.0f) {
            iFloatToIntBits2 = Float.floatToIntBits(getLeft());
        } else {
            iFloatToIntBits2 = 0;
        }
        int i16 = (i15 + iFloatToIntBits2) * 31;
        if (getWidth() != 0.0f) {
            iFloatToIntBits3 = Float.floatToIntBits(getWidth());
        } else {
            iFloatToIntBits3 = 0;
        }
        int i17 = (i16 + iFloatToIntBits3) * 31;
        if (getHeight() != 0.0f) {
            iFloatToIntBits4 = Float.floatToIntBits(getHeight());
        } else {
            iFloatToIntBits4 = 0;
        }
        int i18 = (((i17 + iFloatToIntBits4) * 31) + (isVisibility() ? 1 : 0)) * 31;
        if (getScrollX() != 0.0f) {
            iFloatToIntBits5 = Float.floatToIntBits(getScrollX());
        } else {
            iFloatToIntBits5 = 0;
        }
        int i19 = (i18 + iFloatToIntBits5) * 31;
        if (getScrollY() != 0.0f) {
            iFloatToIntBits6 = Float.floatToIntBits(getScrollY());
        } else {
            iFloatToIntBits6 = 0;
        }
        int i21 = (i19 + iFloatToIntBits6) * 31;
        if (getScale() != 0.0f) {
            iFloatToIntBits7 = Float.floatToIntBits(getScale());
        } else {
            iFloatToIntBits7 = 0;
        }
        int i22 = (i21 + iFloatToIntBits7) * 31;
        if (get$url() != null) {
            iHashCode5 = get$url().hashCode();
        } else {
            iHashCode5 = 0;
        }
        int i23 = (((i22 + iHashCode5) * 31) + getzIndex()) * 31;
        if (getSubelements() != null) {
            iHashCode7 = getSubelements().hashCode();
        }
        return i23 + iHashCode7;
    }
}
