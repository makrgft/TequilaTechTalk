/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NachrichtId {
  NachrichtTyp[] types();
}
