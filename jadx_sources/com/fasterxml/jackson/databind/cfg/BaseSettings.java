package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AbstractC6415l;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes45.dex */
public final class BaseSettings implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final TimeZone f10204b = TimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = 1;
    protected final AccessorNamingStrategy.Provider _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AbstractC6415l _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final Base64Variant _defaultBase64;
    protected final AbstractC6345c _handlerInstantiator;
    protected final Locale _locale;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final InterfaceC6430d<?> _typeResolverBuilder;
    protected final PolymorphicTypeValidator _typeValidator;

    public BaseSettings(AbstractC6415l abstractC6415l, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, InterfaceC6430d<?> interfaceC6430d, DateFormat dateFormat, AbstractC6345c abstractC6345c, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy.Provider provider) {
        this._classIntrospector = abstractC6415l;
        this._annotationIntrospector = annotationIntrospector;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = interfaceC6430d;
        this._dateFormat = dateFormat;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
        this._typeValidator = polymorphicTypeValidator;
        this._accessorNaming = provider;
    }

    public AbstractC6345c getHandlerInstantiator() {
        return null;
    }

    public BaseSettings with(Locale locale) {
        return this._locale == locale ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    /* JADX INFO: renamed from: a */
    public final DateFormat m11182a(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof StdDateFormat) {
            return ((StdDateFormat) dateFormat).withTimeZone(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }

    public BaseSettings copy() {
        return new BaseSettings(this._classIntrospector.copy(), this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._accessorNaming;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public Base64Variant getBase64Variant() {
        return this._defaultBase64;
    }

    public AbstractC6415l getClassIntrospector() {
        return this._classIntrospector;
    }

    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    public Locale getLocale() {
        return this._locale;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._typeValidator;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this._timeZone;
        return timeZone == null ? f10204b : timeZone;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public InterfaceC6430d<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    public boolean hasExplicitTimeZone() {
        return this._timeZone != null;
    }

    public BaseSettings withAccessorNaming(AccessorNamingStrategy.Provider provider) {
        return this._accessorNaming == provider ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, provider);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return this._annotationIntrospector == annotationIntrospector ? this : new BaseSettings(this._classIntrospector, annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(this._annotationIntrospector, annotationIntrospector));
    }

    public BaseSettings withClassIntrospector(AbstractC6415l abstractC6415l) {
        return this._classIntrospector == abstractC6415l ? this : new BaseSettings(abstractC6415l, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withDateFormat(DateFormat dateFormat) {
        if (this._dateFormat == dateFormat) {
            return this;
        }
        if (dateFormat != null && hasExplicitTimeZone()) {
            dateFormat = m11182a(dateFormat, this._timeZone);
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationIntrospector, this._annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        return this._propertyNamingStrategy == propertyNamingStrategy ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withTypeFactory(TypeFactory typeFactory) {
        return this._typeFactory == typeFactory ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withTypeResolverBuilder(InterfaceC6430d<?> interfaceC6430d) {
        return this._typeResolverBuilder == interfaceC6430d ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, interfaceC6430d, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(TimeZone timeZone) {
        if (timeZone == this._timeZone) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, m11182a(this._dateFormat, timeZone == null ? f10204b : timeZone), null, this._locale, timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(Base64Variant base64Variant) {
        return base64Variant == this._defaultBase64 ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, base64Variant, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(PolymorphicTypeValidator polymorphicTypeValidator) {
        return polymorphicTypeValidator == this._typeValidator ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, polymorphicTypeValidator, this._accessorNaming);
    }

    @Deprecated
    public BaseSettings(AbstractC6415l abstractC6415l, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, InterfaceC6430d<?> interfaceC6430d, DateFormat dateFormat, AbstractC6345c abstractC6345c, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator) {
        this(abstractC6415l, annotationIntrospector, propertyNamingStrategy, typeFactory, interfaceC6430d, dateFormat, abstractC6345c, locale, timeZone, base64Variant, polymorphicTypeValidator, new DefaultAccessorNamingStrategy.Provider());
    }

    public BaseSettings withHandlerInstantiator(AbstractC6345c abstractC6345c) {
        return this;
    }
}
