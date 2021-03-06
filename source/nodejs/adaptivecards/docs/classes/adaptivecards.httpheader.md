[Adaptive Cards Javascript SDK](../README.md) / [adaptivecards](../modules/adaptivecards.md) / HttpHeader

# Class: HttpHeader

[adaptivecards](../modules/adaptivecards.md).HttpHeader

## Hierarchy

* [*SerializableObject*](serialization.serializableobject.md)

  ↳ **HttpHeader**

## Table of contents

### Constructors

- [constructor](adaptivecards.httpheader.md#constructor)

### Properties

- [maxVersion](adaptivecards.httpheader.md#maxversion)
- [name](adaptivecards.httpheader.md#name)
- [defaultMaxVersion](adaptivecards.httpheader.md#defaultmaxversion)
- [nameProperty](adaptivecards.httpheader.md#nameproperty)
- [onRegisterCustomProperties](adaptivecards.httpheader.md#onregistercustomproperties)
- [valueProperty](adaptivecards.httpheader.md#valueproperty)

### Accessors

- [value](adaptivecards.httpheader.md#value)

### Methods

- [getCustomProperty](adaptivecards.httpheader.md#getcustomproperty)
- [getDefaultSerializationContext](adaptivecards.httpheader.md#getdefaultserializationcontext)
- [getReferencedInputs](adaptivecards.httpheader.md#getreferencedinputs)
- [getSchema](adaptivecards.httpheader.md#getschema)
- [getSchemaKey](adaptivecards.httpheader.md#getschemakey)
- [getValue](adaptivecards.httpheader.md#getvalue)
- [hasAllDefaultValues](adaptivecards.httpheader.md#hasalldefaultvalues)
- [hasDefaultValue](adaptivecards.httpheader.md#hasdefaultvalue)
- [internalParse](adaptivecards.httpheader.md#internalparse)
- [internalToJSON](adaptivecards.httpheader.md#internaltojson)
- [parse](adaptivecards.httpheader.md#parse)
- [populateSchema](adaptivecards.httpheader.md#populateschema)
- [prepareForExecution](adaptivecards.httpheader.md#prepareforexecution)
- [resetDefaultValues](adaptivecards.httpheader.md#resetdefaultvalues)
- [setCustomProperty](adaptivecards.httpheader.md#setcustomproperty)
- [setValue](adaptivecards.httpheader.md#setvalue)
- [shouldSerialize](adaptivecards.httpheader.md#shouldserialize)
- [toJSON](adaptivecards.httpheader.md#tojson)

## Constructors

### constructor

\+ **new HttpHeader**(`name?`: *string*, `value?`: *string*): [*HttpHeader*](card_elements.httpheader.md)

#### Parameters:

Name | Type | Default value |
:------ | :------ | :------ |
`name` | *string* | "" |
`value` | *string* | "" |

**Returns:** [*HttpHeader*](card_elements.httpheader.md)

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [card-elements.ts:4239](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4239)

## Properties

### maxVersion

• **maxVersion**: [*Version*](serialization.version.md)

Inherited from: [SerializableObject](serialization.serializableobject.md).[maxVersion](serialization.serializableobject.md#maxversion)

Defined in: [serialization.ts:898](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L898)

___

### name

• **name**: *string*

Defined in: [card-elements.ts:4236](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4236)

___

### defaultMaxVersion

▪ `Static` **defaultMaxVersion**: [*Version*](serialization.version.md)

Inherited from: [SerializableObject](serialization.serializableobject.md).[defaultMaxVersion](serialization.serializableobject.md#defaultmaxversion)

Defined in: [serialization.ts:775](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L775)

___

### nameProperty

▪ `Readonly` `Static` **nameProperty**: [*StringProperty*](serialization.stringproperty.md)

Defined in: [card-elements.ts:4228](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4228)

___

### onRegisterCustomProperties

▪ `Optional` `Static` **onRegisterCustomProperties**: *undefined* \| (`sender`: [*SerializableObject*](serialization.serializableobject.md), `schema`: [*SerializableObjectSchema*](serialization.serializableobjectschema.md)) => *void*

Inherited from: [SerializableObject](serialization.serializableobject.md).[onRegisterCustomProperties](serialization.serializableobject.md#onregistercustomproperties)

Defined in: [serialization.ts:774](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L774)

___

### valueProperty

▪ `Readonly` `Static` **valueProperty**: *StringWithSubstitutionProperty*

Defined in: [card-elements.ts:4229](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4229)

## Accessors

### value

• get **value**(): *undefined* \| *string*

**Returns:** *undefined* \| *string*

Defined in: [card-elements.ts:4258](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4258)

• set **value**(`newValue`: *undefined* \| *string*): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`newValue` | *undefined* \| *string* |

**Returns:** *void*

Defined in: [card-elements.ts:4262](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4262)

## Methods

### getCustomProperty

▸ **getCustomProperty**(`name`: *string*): *any*

#### Parameters:

Name | Type |
:------ | :------ |
`name` | *string* |

**Returns:** *any*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:985](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L985)

___

### getDefaultSerializationContext

▸ `Protected`**getDefaultSerializationContext**(): [*BaseSerializationContext*](serialization.baseserializationcontext.md)

**Returns:** [*BaseSerializationContext*](serialization.baseserializationcontext.md)

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:784](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L784)

___

### getReferencedInputs

▸ **getReferencedInputs**(`inputs`: [*Input*](card_elements.input.md)[], `referencedInputs`: [*Dictionary*](../modules/shared.md#dictionary)<[*Input*](card_elements.input.md)\>): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`inputs` | [*Input*](card_elements.input.md)[] |
`referencedInputs` | [*Dictionary*](../modules/shared.md#dictionary)<[*Input*](card_elements.input.md)\> |

**Returns:** *void*

Defined in: [card-elements.ts:4250](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4250)

___

### getSchema

▸ **getSchema**(): [*SerializableObjectSchema*](serialization.serializableobjectschema.md)

**Returns:** [*SerializableObjectSchema*](serialization.serializableobjectschema.md)

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:989](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L989)

___

### getSchemaKey

▸ `Protected`**getSchemaKey**(): *string*

**Returns:** *string*

Overrides: [SerializableObject](serialization.serializableobject.md)

Defined in: [card-elements.ts:4231](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4231)

___

### getValue

▸ `Protected`**getValue**(`property`: [*PropertyDefinition*](serialization.propertydefinition.md)): *any*

#### Parameters:

Name | Type |
:------ | :------ |
`property` | [*PropertyDefinition*](serialization.propertydefinition.md) |

**Returns:** *any*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:826](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L826)

___

### hasAllDefaultValues

▸ **hasAllDefaultValues**(): *boolean*

**Returns:** *boolean*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:950](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L950)

___

### hasDefaultValue

▸ **hasDefaultValue**(`property`: [*PropertyDefinition*](serialization.propertydefinition.md)): *boolean*

#### Parameters:

Name | Type |
:------ | :------ |
`property` | [*PropertyDefinition*](serialization.propertydefinition.md) |

**Returns:** *boolean*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:946](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L946)

___

### internalParse

▸ `Protected`**internalParse**(`source`: [*PropertyBag*](../modules/serialization.md#propertybag), `context`: [*BaseSerializationContext*](serialization.baseserializationcontext.md)): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`source` | [*PropertyBag*](../modules/serialization.md#propertybag) |
`context` | [*BaseSerializationContext*](serialization.baseserializationcontext.md) |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:839](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L839)

___

### internalToJSON

▸ `Protected`**internalToJSON**(`target`: [*PropertyBag*](../modules/serialization.md#propertybag), `context`: [*BaseSerializationContext*](serialization.baseserializationcontext.md)): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`target` | [*PropertyBag*](../modules/serialization.md#propertybag) |
`context` | [*BaseSerializationContext*](serialization.baseserializationcontext.md) |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:876](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L876)

___

### parse

▸ **parse**(`source`: [*PropertyBag*](../modules/serialization.md#propertybag), `context?`: [*BaseSerializationContext*](serialization.baseserializationcontext.md)): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`source` | [*PropertyBag*](../modules/serialization.md#propertybag) |
`context?` | [*BaseSerializationContext*](serialization.baseserializationcontext.md) |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:912](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L912)

___

### populateSchema

▸ `Protected`**populateSchema**(`schema`: [*SerializableObjectSchema*](serialization.serializableobjectschema.md)): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`schema` | [*SerializableObjectSchema*](serialization.serializableobjectschema.md) |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:788](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L788)

___

### prepareForExecution

▸ **prepareForExecution**(`inputs`: [*Dictionary*](../modules/shared.md#dictionary)<[*Input*](card_elements.input.md)\>): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`inputs` | [*Dictionary*](../modules/shared.md#dictionary)<[*Input*](card_elements.input.md)\> |

**Returns:** *void*

Defined in: [card-elements.ts:4254](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/card-elements.ts#L4254)

___

### resetDefaultValues

▸ **resetDefaultValues**(): *void*

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:964](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L964)

___

### setCustomProperty

▸ **setCustomProperty**(`name`: *string*, `value`: *any*): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`name` | *string* |
`value` | *any* |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:974](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L974)

___

### setValue

▸ `Protected`**setValue**(`property`: [*PropertyDefinition*](serialization.propertydefinition.md), `value`: *any*): *void*

#### Parameters:

Name | Type |
:------ | :------ |
`property` | [*PropertyDefinition*](serialization.propertydefinition.md) |
`value` | *any* |

**Returns:** *void*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:830](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L830)

___

### shouldSerialize

▸ `Protected`**shouldSerialize**(`context`: [*BaseSerializationContext*](serialization.baseserializationcontext.md)): *boolean*

#### Parameters:

Name | Type |
:------ | :------ |
`context` | [*BaseSerializationContext*](serialization.baseserializationcontext.md) |

**Returns:** *boolean*

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:894](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L894)

___

### toJSON

▸ **toJSON**(`context?`: [*BaseSerializationContext*](serialization.baseserializationcontext.md)): *undefined* \| [*PropertyBag*](../modules/serialization.md#propertybag)

#### Parameters:

Name | Type |
:------ | :------ |
`context?` | [*BaseSerializationContext*](serialization.baseserializationcontext.md) |

**Returns:** *undefined* \| [*PropertyBag*](../modules/serialization.md#propertybag)

Inherited from: [SerializableObject](serialization.serializableobject.md)

Defined in: [serialization.ts:916](https://github.com/microsoft/AdaptiveCards/blob/0938a1f10/source/nodejs/adaptivecards/src/serialization.ts#L916)
