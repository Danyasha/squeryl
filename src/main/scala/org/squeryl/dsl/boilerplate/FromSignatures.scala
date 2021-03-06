/*******************************************************************************
 * Copyright 2010 Maxime Lévesque
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************** */
package org.squeryl.dsl.boilerplate

import org.squeryl.dsl.QueryYield
import org.squeryl.{Queryable, Query}


trait FromSignatures {

  def from[T1,R](t1:Queryable[T1])(f: Function1[T1,QueryYield[R]]): Query[R] =
    new Query1[T1,R](t1,f,true, Nil)

  def from[T1,T2,R](t1:Queryable[T1], t2:Queryable[T2])(f: Function2[T1,T2,QueryYield[R]]): Query[R] =
    new Query2[T1,T2,R](t1,t2,f,true,Nil)

  def from[T1,T2,T3,R](t1:Queryable[T1],t2:Queryable[T2],t3:Queryable[T3])
                      (f: Function3[T1,T2,T3,QueryYield[R]]): Query[R] =
    new Query3[T1,T2,T3,R](t1,t2,t3,f,true,Nil)

  def from[T1,T2,T3,T4,R](t1:Queryable[T1],t2:Queryable[T2],t3:Queryable[T3],t4:Queryable[T4])
                      (f: Function4[T1,T2,T3,T4,QueryYield[R]]): Query[R] =
    new Query4[T1,T2,T3,T4,R](t1,t2,t3,t4,f,true,Nil)

  def from[T1,T2,T3,T4,T5,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5]
          )(f: Function5[T1,T2,T3,T4,T5,QueryYield[R]]): Query[R] =
    new Query5[T1,T2,T3,T4,T5,R](t1,t2,t3,t4,t5,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5],
          t6:Queryable[T6]
          )(f:Function6[T1,T2,T3,T4,T5,T6,QueryYield[R]]): Query[R] =
    new Query6[T1,T2,T3,T4,T5,T6,R](t1,t2,t3,t4,t5,t6,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5],
          t6:Queryable[T6],
          t7:Queryable[T7]
          )(f:Function7[T1,T2,T3,T4,T5,T6,T7,QueryYield[R]]): Query[R] =
    new Query7[T1,T2,T3,T4,T5,T6,T7,R](t1,t2,t3,t4,t5,t6,t7,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5],
          t6:Queryable[T6],
          t7:Queryable[T7],
          t8:Queryable[T8]
          )(f:Function8[T1,T2,T3,T4,T5,T6,T7,T8,QueryYield[R]]): Query[R] =
    new Query8[T1,T2,T3,T4,T5,T6,T7,T8,R](t1,t2,t3,t4,t5,t6,t7,t8,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5],
          t6:Queryable[T6],
          t7:Queryable[T7],
          t8:Queryable[T8],
          t9:Queryable[T9]
          )(f:Function9[T1,T2,T3,T4,T5,T6,T7,T8,T9,QueryYield[R]]): Query[R] =
    new Query9[T1,T2,T3,T4,T5,T6,T7,T8,T9,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R](
          t1:Queryable[T1],
          t2:Queryable[T2],
          t3:Queryable[T3],
          t4:Queryable[T4],
          t5:Queryable[T5],
          t6:Queryable[T6],
          t7:Queryable[T7],
          t8:Queryable[T8],
          t9:Queryable[T9],
          t10:Queryable[T10]
          )(f:Function10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,QueryYield[R]]): Query[R] =
    new Query10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R](
                                              t1:Queryable[T1],
                                              t2:Queryable[T2],
                                              t3:Queryable[T3],
                                              t4:Queryable[T4],
                                              t5:Queryable[T5],
                                              t6:Queryable[T6],
                                              t7:Queryable[T7],
                                              t8:Queryable[T8],
                                              t9:Queryable[T9],
                                              t10:Queryable[T10],
                                              t11:Queryable[T11]
                                            )(f:Function11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,QueryYield[R]]): Query[R] =
    new Query11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R](
                                                      t1:Queryable[T1],
                                                      t2:Queryable[T2],
                                                      t3:Queryable[T3],
                                                      t4:Queryable[T4],
                                                      t5:Queryable[T5],
                                                      t6:Queryable[T6],
                                                      t7:Queryable[T7],
                                                      t8:Queryable[T8],
                                                      t9:Queryable[T9],
                                                      t10:Queryable[T10],
                                                      t11:Queryable[T11],
                                                      t12:Queryable[T12]
                                                )( f: Function12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,QueryYield[R]]): Query[R] =
    new Query12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R](
                                                          t1:Queryable[T1],
                                                          t2:Queryable[T2],
                                                          t3:Queryable[T3],
                                                          t4:Queryable[T4],
                                                          t5:Queryable[T5],
                                                          t6:Queryable[T6],
                                                          t7:Queryable[T7],
                                                          t8:Queryable[T8],
                                                          t9:Queryable[T9],
                                                          t10:Queryable[T10],
                                                          t11:Queryable[T11],
                                                          t12:Queryable[T12],
                                                          t13:Queryable[T13]
                                                    )(f: Function13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,QueryYield[R]]): Query[R] =
    new Query13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R](
                                                              t1:Queryable[T1],
                                                              t2:Queryable[T2],
                                                              t3:Queryable[T3],
                                                              t4:Queryable[T4],
                                                              t5:Queryable[T5],
                                                              t6:Queryable[T6],
                                                              t7:Queryable[T7],
                                                              t8:Queryable[T8],
                                                              t9:Queryable[T9],
                                                              t10:Queryable[T10],
                                                              t11:Queryable[T11],
                                                              t12:Queryable[T12],
                                                              t13:Queryable[T13],
                                                              t14:Queryable[T14]
                                                        )(f: Function14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,QueryYield[R]]): Query[R] =
    new Query14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R](
                                                                  t1:Queryable[T1],
                                                                  t2:Queryable[T2],
                                                                  t3:Queryable[T3],
                                                                  t4:Queryable[T4],
                                                                  t5:Queryable[T5],
                                                                  t6:Queryable[T6],
                                                                  t7:Queryable[T7],
                                                                  t8:Queryable[T8],
                                                                  t9:Queryable[T9],
                                                                  t10:Queryable[T10],
                                                                  t11:Queryable[T11],
                                                                  t12:Queryable[T12],
                                                                  t13:Queryable[T13],
                                                                  t14:Queryable[T14],
                                                                  t15:Queryable[T15]
                                                            )(f: Function15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,QueryYield[R]]): Query[R] =
    new Query15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,f,true,Nil)

  def from[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R](
                                                                      t1:Queryable[T1],
                                                                      t2:Queryable[T2],
                                                                      t3:Queryable[T3],
                                                                      t4:Queryable[T4],
                                                                      t5:Queryable[T5],
                                                                      t6:Queryable[T6],
                                                                      t7:Queryable[T7],
                                                                      t8:Queryable[T8],
                                                                      t9:Queryable[T9],
                                                                      t10:Queryable[T10],
                                                                      t11:Queryable[T11],
                                                                      t12:Queryable[T12],
                                                                      t13:Queryable[T13],
                                                                      t14:Queryable[T14],
                                                                      t15:Queryable[T15],
                                                                      t16:Queryable[T16]
                                                                )(f: Function16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,QueryYield[R]]): Query[R] =
    new Query16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R](t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,f,true,Nil)
}
