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
package org.squeryl.dsl

import ast.{LogicalBoolean, ExpressionNode, QueryExpressionNode, SelectElement}
import boilerplate._
import org.squeryl.internals.{ResultSetMapper}
import java.sql.ResultSet

import org.squeryl.Query

trait QueryYield[R] {

  def invokeYield(resultSetMapper: ResultSetMapper, rs: ResultSet): R

  def invokeYieldForAst(q: QueryExpressionNode[_], rsm: ResultSetMapper):
    (Iterable[SelectElement],AnyRef)

  def queryElements:
    (Option[ExpressionNode],
     Option[ExpressionNode],
     Iterable[ExpressionNode],
     Iterable[ExpressionNode],
     Iterable[Query[_]])

  private [squeryl] var joinExpressions: collection.Seq[()=>LogicalBoolean] = Nil

  def on(lb1: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1)
    new JoinQueryYield1(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2)
    new JoinQueryYield2(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3)
    new JoinQueryYield3(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4)
    new JoinQueryYield4(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5)
    new JoinQueryYield5(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6)
    new JoinQueryYield6(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7)
    new JoinQueryYield7(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8)
    new JoinQueryYield8(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9)
    new JoinQueryYield9(this)
  }
  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10)
    new JoinQueryYield10(this)
  }
  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean, lb11: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10, () => lb11)
    new JoinQueryYield11(this)
  }

  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean, lb11: =>LogicalBoolean, lb12: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10, () => lb11, () => lb12)
    new JoinQueryYield12(this)
  }
  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean, lb11: =>LogicalBoolean, lb12: =>LogicalBoolean, lb13: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10, () => lb11, () => lb12, () => lb13)
    new JoinQueryYield13(this)
  }
  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean, lb11: =>LogicalBoolean, lb12: =>LogicalBoolean, lb13: =>LogicalBoolean, lb14: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10, () => lb11, () => lb12, () => lb13, () => lb14)
    new JoinQueryYield14(this)
  }
  def on(lb1: =>LogicalBoolean, lb2: =>LogicalBoolean, lb3: =>LogicalBoolean, lb4: =>LogicalBoolean, lb5: =>LogicalBoolean, lb6: =>LogicalBoolean, lb7: =>LogicalBoolean, lb8: =>LogicalBoolean, lb9: =>LogicalBoolean, lb10: =>LogicalBoolean, lb11: =>LogicalBoolean, lb12: =>LogicalBoolean, lb13: =>LogicalBoolean, lb14: =>LogicalBoolean, lb15: =>LogicalBoolean) = {
    joinExpressions = Seq(() => lb1, () => lb2, () => lb3, () => lb4, () => lb5, () => lb6, () => lb7, () => lb8, () => lb9, () => lb10, () => lb11, () => lb12, () => lb13, () => lb14, () => lb15)
    new JoinQueryYield15(this)
  }
}
