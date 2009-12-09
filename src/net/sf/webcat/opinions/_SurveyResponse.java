/*==========================================================================*\
 |  _SurveyResponse.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to SurveyResponse.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2009 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package net.sf.webcat.opinions;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import er.extensions.eof.ERXKey;
import java.util.Enumeration;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * SurveyResponse.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _SurveyResponse
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _SurveyResponse object.
     */
    public _SurveyResponse()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * SurveyResponse object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @return The newly created object
     */
    public static SurveyResponse create(
        EOEditingContext editingContext
        )
    {
        SurveyResponse eoObject = (SurveyResponse)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _SurveyResponse.ENTITY_NAME);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static SurveyResponse localInstance(
        EOEditingContext editingContext, SurveyResponse eo)
    {
        return (eo == null)
            ? null
            : (SurveyResponse)EOUtilities.localInstanceOfObject(
                editingContext, eo);
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static SurveyResponse forId(
        EOEditingContext ec, int id )
    {
        SurveyResponse obj = null;
        if (id > 0)
        {
            NSArray<SurveyResponse> results =
                objectsMatchingValues(ec, "id", new Integer(id));
            if (results != null && results.count() > 0)
            {
                obj = results.objectAtIndex(0);
            }
        }
        return obj;
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static SurveyResponse forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.foundation.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String IS_STAFF_KEY = "isStaff";
    public static final ERXKey<Integer> isStaff =
        new ERXKey<Integer>(IS_STAFF_KEY);
    public static final String Q1_KEY = "q1";
    public static final ERXKey<Integer> q1 =
        new ERXKey<Integer>(Q1_KEY);
    public static final String Q2_KEY = "q2";
    public static final ERXKey<Integer> q2 =
        new ERXKey<Integer>(Q2_KEY);
    public static final String Q3_KEY = "q3";
    public static final ERXKey<Integer> q3 =
        new ERXKey<Integer>(Q3_KEY);
    public static final String Q4_KEY = "q4";
    public static final ERXKey<Integer> q4 =
        new ERXKey<Integer>(Q4_KEY);
    public static final String Q5_KEY = "q5";
    public static final ERXKey<Integer> q5 =
        new ERXKey<Integer>(Q5_KEY);
    public static final String Q6_KEY = "q6";
    public static final ERXKey<Integer> q6 =
        new ERXKey<Integer>(Q6_KEY);
    public static final String SUBMIT_TIME_KEY = "submitTime";
    public static final ERXKey<NSTimestamp> submitTime =
        new ERXKey<NSTimestamp>(SUBMIT_TIME_KEY);
    public static final String TEXT1_KEY = "text1";
    public static final ERXKey<String> text1 =
        new ERXKey<String>(TEXT1_KEY);
    public static final String TEXT2_KEY = "text2";
    public static final ERXKey<String> text2 =
        new ERXKey<String>(TEXT2_KEY);
    public static final String TEXT3_KEY = "text3";
    public static final ERXKey<String> text3 =
        new ERXKey<String>(TEXT3_KEY);
    public static final String TEXT4_KEY = "text4";
    public static final ERXKey<String> text4 =
        new ERXKey<String>(TEXT4_KEY);
    // To-one relationships ---
    public static final String ASSIGNMENT_OFFERING_KEY = "assignmentOffering";
    public static final ERXKey<net.sf.webcat.grader.AssignmentOffering> assignmentOffering =
        new ERXKey<net.sf.webcat.grader.AssignmentOffering>(ASSIGNMENT_OFFERING_KEY);
    public static final String USER_KEY = "user";
    public static final ERXKey<net.sf.webcat.core.User> user =
        new ERXKey<net.sf.webcat.core.User>(USER_KEY);
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ASSIGNMENT_OFFERING_FSPEC = "AssignmentOffering";
    public static final String ASSIGNMENT_OFFERING_AND_USER_FSPEC = "AssignmentOfferingAndUser";
    public static final String USER_FSPEC = "User";
    public static final String ENTITY_NAME = "SurveyResponse";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public SurveyResponse localInstance(EOEditingContext editingContext)
    {
        return (SurveyResponse)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    @SuppressWarnings("unchecked")
    public NSDictionary<String, Object> changedProperties()
    {
        return changesFromSnapshot(
            editingContext().committedSnapshotForObject(this) );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>id</code> value.
     * @return the value of the attribute
     */
    public Number id()
    {
        try
        {
            return (Number)EOUtilities.primaryKeyForObject(
                editingContext() , this ).objectForKey( "id" );
        }
        catch (Exception e)
        {
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isStaff</code> value.
     * @return the value of the attribute
     */
    public boolean isStaff()
    {
        Integer result =
            (Integer)storedValueForKey( "isStaff" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isStaff</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsStaff( boolean value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsStaff("
                + value + "): was " + isStaff() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value ? 1 : 0 );
            setIsStaffRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isStaff</code> value.
     * @return the value of the attribute
     */
    public Integer isStaffRaw()
    {
        return (Integer)storedValueForKey( "isStaff" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isStaff</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsStaffRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsStaffRaw("
                + value + "): was " + isStaffRaw() );
        }
        takeStoredValueForKey( value, "isStaff" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q1</code> value.
     * @return the value of the attribute
     */
    public Integer q1()
    {
        return (Integer)storedValueForKey( "q1" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q1</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ1( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ1("
                + value + "): was " + q1() );
        }
        takeStoredValueForKey( value, "q1" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q2</code> value.
     * @return the value of the attribute
     */
    public Integer q2()
    {
        return (Integer)storedValueForKey( "q2" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q2</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ2( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ2("
                + value + "): was " + q2() );
        }
        takeStoredValueForKey( value, "q2" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q3</code> value.
     * @return the value of the attribute
     */
    public Integer q3()
    {
        return (Integer)storedValueForKey( "q3" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q3</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ3( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ3("
                + value + "): was " + q3() );
        }
        takeStoredValueForKey( value, "q3" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q4</code> value.
     * @return the value of the attribute
     */
    public Integer q4()
    {
        return (Integer)storedValueForKey( "q4" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q4</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ4( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ4("
                + value + "): was " + q4() );
        }
        takeStoredValueForKey( value, "q4" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q5</code> value.
     * @return the value of the attribute
     */
    public Integer q5()
    {
        return (Integer)storedValueForKey( "q5" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q5</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ5( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ5("
                + value + "): was " + q5() );
        }
        takeStoredValueForKey( value, "q5" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>q6</code> value.
     * @return the value of the attribute
     */
    public Integer q6()
    {
        return (Integer)storedValueForKey( "q6" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>q6</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQ6( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setQ6("
                + value + "): was " + q6() );
        }
        takeStoredValueForKey( value, "q6" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>submitTime</code> value.
     * @return the value of the attribute
     */
    public NSTimestamp submitTime()
    {
        return (NSTimestamp)storedValueForKey( "submitTime" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>submitTime</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setSubmitTime( NSTimestamp value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmitTime("
                + value + "): was " + submitTime() );
        }
        takeStoredValueForKey( value, "submitTime" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>text1</code> value.
     * @return the value of the attribute
     */
    public String text1()
    {
        return (String)storedValueForKey( "text1" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>text1</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setText1( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setText1("
                + value + "): was " + text1() );
        }
        takeStoredValueForKey( value, "text1" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>text2</code> value.
     * @return the value of the attribute
     */
    public String text2()
    {
        return (String)storedValueForKey( "text2" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>text2</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setText2( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setText2("
                + value + "): was " + text2() );
        }
        takeStoredValueForKey( value, "text2" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>text3</code> value.
     * @return the value of the attribute
     */
    public String text3()
    {
        return (String)storedValueForKey( "text3" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>text3</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setText3( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setText3("
                + value + "): was " + text3() );
        }
        takeStoredValueForKey( value, "text3" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>text4</code> value.
     * @return the value of the attribute
     */
    public String text4()
    {
        return (String)storedValueForKey( "text4" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>text4</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setText4( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setText4("
                + value + "): was " + text4() );
        }
        takeStoredValueForKey( value, "text4" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>assignmentOffering</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.AssignmentOffering assignmentOffering()
    {
        return (net.sf.webcat.grader.AssignmentOffering)storedValueForKey( "assignmentOffering" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>assignmentOffering</code>
     * relationship (DO NOT USE--instead, use
     * <code>setAssignmentOfferingRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setAssignmentOffering( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAssignmentOffering("
                + value + "): was " + assignmentOffering() );
        }
        takeStoredValueForKey( value, "assignmentOffering" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>assignmentOffering</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setAssignmentOfferingRelationship(
        net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAssignmentOfferingRelationship("
                + value + "): was " + assignmentOffering() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.AssignmentOffering object = assignmentOffering();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "assignmentOffering" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "assignmentOffering" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>user</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.core.User user()
    {
        return (net.sf.webcat.core.User)storedValueForKey( "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship (DO NOT USE--instead, use
     * <code>setUserRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setUser( net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUser("
                + value + "): was " + user() );
        }
        takeStoredValueForKey( value, "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setUserRelationship(
        net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUserRelationship("
                + value + "): was " + user() );
        }
        if ( value == null )
        {
            net.sf.webcat.core.User object = user();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "user" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "user" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a fetch specification.
     *
     * @param context The editing context to use
     * @param fspec The fetch specification to use
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<SurveyResponse> objectsWithFetchSpecification(
        EOEditingContext context,
        EOFetchSpecification fspec)
    {
        return context.objectsWithFetchSpecification(fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> allObjects(
        EOEditingContext context)
    {
        return objectsMatchingQualifier(context, null, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier)
    {
        return objectsMatchingQualifier(context, qualifier, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier and sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings The sort orderings to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        return objectsWithFetchSpecification(context, fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<SurveyResponse> objectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return EOUtilities.objectsMatchingValues(context, ENTITY_NAME,
            keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the single entity that was retrieved
     *
     * @throws EOObjectNotAvailableException
     *     if there is no matching object
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static SurveyResponse objectMatchingValues(
        EOEditingContext context,
        Object... keysAndValues) throws EOObjectNotAvailableException,
                                        EOUtilities.MoreThanOneException
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve an object using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the single entity that was retrieved
     *
     * @throws EOObjectNotAvailableException
     *     if there is no matching object
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static SurveyResponse objectMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
        throws EOObjectNotAvailableException,
               EOUtilities.MoreThanOneException
    {
        return (SurveyResponse)EOUtilities.objectMatchingValues(
            context, ENTITY_NAME, keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>AssignmentOffering</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsForAssignmentOffering(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "AssignmentOffering", "SurveyResponse" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( assignmentOfferingBinding != null )
        {
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray<SurveyResponse> result = objectsWithFetchSpecification( context, spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForAssignmentOffering(ec"
                + ", " + assignmentOfferingBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>AssignmentOfferingAndUser</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsForAssignmentOfferingAndUser(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "AssignmentOfferingAndUser", "SurveyResponse" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( assignmentOfferingBinding != null )
        {
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        }
        if ( userBinding != null )
        {
            bindings.setObjectForKey( userBinding,
                                      "user" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray<SurveyResponse> result = objectsWithFetchSpecification( context, spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForAssignmentOfferingAndUser(ec"
                + ", " + assignmentOfferingBinding
                + ", " + userBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>User</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<SurveyResponse> objectsForUser(
            EOEditingContext context,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "User", "SurveyResponse" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( userBinding != null )
        {
            bindings.setObjectForKey( userBinding,
                                      "user" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray<SurveyResponse> result = objectsWithFetchSpecification( context, spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForUser(ec"
                + ", " + userBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Produce a string representation of this object.  This implementation
     * calls UserPresentableDescription(), which uses WebObjects' internal
     * mechanism to print out the visible fields of this object.  Normally,
     * subclasses would override userPresentableDescription() to change
     * the way the object is printed.
     *
     * @return A string representation of the object's value
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( SurveyResponse.class );
}
