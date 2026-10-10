package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class PropertyMetadata implements Serializable {
    private static final long serialVersionUID = -1;
    protected Nulls _contentNulls;
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final transient C6338a _mergeInfo;
    protected final Boolean _required;
    protected Nulls _valueNulls;
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.PropertyMetadata$a */
    public static final class C6338a {

        /* JADX INFO: renamed from: a */
        public final AnnotatedMember f10197a;

        /* JADX INFO: renamed from: b */
        public final boolean f10198b;

        /* JADX INFO: renamed from: a */
        public static C6338a m11143a(AnnotatedMember annotatedMember) {
            return new C6338a(annotatedMember, true);
        }

        /* JADX INFO: renamed from: b */
        public static C6338a m11144b(AnnotatedMember annotatedMember) {
            return new C6338a(annotatedMember, false);
        }

        /* JADX INFO: renamed from: c */
        public static C6338a m11145c(AnnotatedMember annotatedMember) {
            return new C6338a(annotatedMember, false);
        }

        public C6338a(AnnotatedMember annotatedMember, boolean z11) {
            this.f10197a = annotatedMember;
            this.f10198b = z11;
        }
    }

    public static PropertyMetadata construct(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new PropertyMetadata(bool, str, num, str2, null, null, null);
        }
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        return bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    public Nulls getContentNulls() {
        return this._contentNulls;
    }

    public String getDefaultValue() {
        return this._defaultValue;
    }

    public String getDescription() {
        return this._description;
    }

    public Integer getIndex() {
        return this._index;
    }

    public C6338a getMergeInfo() {
        return this._mergeInfo;
    }

    public Boolean getRequired() {
        return this._required;
    }

    public Nulls getValueNulls() {
        return this._valueNulls;
    }

    public boolean hasDefaultValue() {
        return this._defaultValue != null;
    }

    public boolean hasIndex() {
        return this._index != null;
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        return bool != null && bool.booleanValue();
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this._mergeInfo != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        return bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r9.equals(r8._defaultValue) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertyMetadata withDefaultValue(String str) {
        if (str == null || str.isEmpty()) {
            if (this._defaultValue != null) {
                str = null;
                return new PropertyMetadata(this._required, this._description, this._index, str, this._mergeInfo, this._valueNulls, this._contentNulls);
            }
            return this;
        }
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withIndex(Integer num) {
        return new PropertyMetadata(this._required, this._description, num, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withMergeInfo(C6338a c6338a) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, c6338a, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withNulls(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, this._mergeInfo, nulls, nulls2);
    }

    public PropertyMetadata withRequired(Boolean bool) {
        return (bool != null ? !bool.equals(this._required) : this._required != null) ? new PropertyMetadata(bool, this._description, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls) : this;
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, C6338a c6338a, Nulls nulls, Nulls nulls2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this._mergeInfo = c6338a;
        this._valueNulls = nulls;
        this._contentNulls = nulls2;
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z11, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z11 ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(Boolean.valueOf(z11), str, num, str2, null, null, null);
    }
}
