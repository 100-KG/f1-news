/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.model.repository;

/**
 *
 * @author motramkg
 */
public class CheatSheet {
    /**
 * =====================================================================
 * SPRING DATA JPA & JPQL CHEAT SHEET
 * =====================================================================
 * 
 * 
 * * 1. QUERY METHOD NAMING (Naming Pattern):
 * Structure: [Subject][Predicate][Property][Condition]
 * - Subjects: findBy, existsBy, countBy, deleteBy, queryBy, getBy
 * - Conditions: And, Or, IsNull, IsNotNull, Containing, StartingWith, 
 * - IgnoreCase, Before, After, Between, LessThan, GreaterThan
 * - Equality:   findByUsername (Equal is default)
 * - Boolean:    findByActiveTrue(), findByActiveFalse()
 * - Comparison: findByAgeLessThan, findByAgeGreaterThan, findByAgeBetween
 * - Nullity:    findByEmailIsNull, findByEmailIsNotNull
 * - Similarity: findByNameStartingWith, findByNameContaining, findByNameLike
 * - Multiple:   And, Or (e.g., findByUsernameAndStatus)
 * - Sorting:    findByStatusOrderByCreatedAtDesc
 * - Example: findByTitleContainingAndStatusOrderByCreatedAtDesc(String t, String s)
 * 
 * 
 * * 2. JPQL SYNTAX (@Query):
 * - Focus: Query on Entities (Class names) NOT Database Tables.
 * - Basic: @Query("SELECT n FROM News n WHERE n.id = :id")
 * - Params: Use ':' for named parameters (e.g., :keyword)
 * - Update/Delete: Must use @Modifying combined with @Query.
 * - Example: @Query("UPDATE News n SET n.views = n.views + 1 WHERE n.id = :id")
 * 
 * 
 * * 3. TRANSACTIONAL GUIDELINES:
 * - Service Layer: Place @Transactional here for business logic (multi-step).
 * - Repository Layer: 
 * + Not needed for default methods (save, find, delete).
 * + MANDATORY for custom @Modifying @Query (Update/Delete) to avoid 
 * TransactionRequiredException.
 * + If Service is @Transactional, Repository joins the existing transaction.
 * 
 * 
 * * 4. IMPORTANT NOTES:
 * - Method parameter order MUST match the naming order or @Param names.
 * - Use Optional<T> for single results to avoid NullPointerException.
 * - Use List<T> or Page<T> for multiple results.
 * =====================================================================
 */
}
