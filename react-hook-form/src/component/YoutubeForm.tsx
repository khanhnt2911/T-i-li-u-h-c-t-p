import {
  FormProvider,
  useFieldArray,
  useForm,
  useWatch,
} from 'react-hook-form';

let renderCount = 0;

type FormModel = {
  username: string;
  email: string;
  channel: string;
  social: {
    facebook: string;
    twitter: string;
  };
  phoneNumbers: string[];
  phNumbers: {
    number: string;
  }[];
  age: number;
  dob: Date;
};

const YoutubeForm = () => {

  const methods = useForm<FormModel>({
    defaultValues: {
      username: '',
      email: '',
      channel: '',
      social: {
        twitter: '',
        facebook: '',
      },
      phoneNumbers: ['', ''],
      phNumbers: [
        {
          number: '',
        },
      ],
      age: 0,
      dob: new Date(),
    },
  });

  const { fields, append, remove } = useFieldArray({
    control: methods.control,
    name: 'phNumbers',
  });

  const userName = useWatch({
    control: methods.control,
    name: 'username',
  });

  const handleSubmitForm = (values: FormModel) => {
    console.log('🚀 ~ handleSubmitForm ~ value:', values);
  };

  const handleGetValue = () => {
    console.log('🚀 ~ handleGetValue ~ data:', methods.getValues('age'));
  }

  renderCount++;

  return (
    <FormProvider {...methods}>
      <div className="container flex flex-col items-center">
        <h1 className="h1 mb-4">Youtube Form {renderCount / 2}</h1>
        <h1 className="h1 mb-4">{userName.toString()}</h1>
        <form
          className="form"
          onSubmit={methods.handleSubmit(handleSubmitForm)}
          noValidate
        >
          <div className="input-container ic1">
            <input
              id="username"
              className="input"
              type="text"
              placeholder="Username"
              {...methods.register('username')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="email"
              className="input"
              type="text"
              placeholder="Email"
              {...methods.register('email')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="channel"
              className="input"
              type="text"
              placeholder="Channel"
              {...methods.register('channel')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="twitter"
              className="input"
              type="text"
              placeholder="Tiwtter"
              {...methods.register('social.twitter')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="facebook"
              className="input"
              type="text"
              placeholder="Facebook"
              {...methods.register('social.facebook')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="phoneNumbers"
              className="input"
              type="text"
              placeholder="First phone number"
              {...methods.register('phoneNumbers.0')}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="phoneNumbers"
              className="input"
              type="text"
              placeholder="Secondary phone number"
              {...methods.register('phoneNumbers.1')}
            />
          </div>

          {fields.map((field: { number: string }, index: number) => (
            <div key={index} className="input-container ic2 flex gap-x-4">
              <input
                id="phoneNumbers"
                className="input"
                type="text"
                placeholder="list of phone numbers"
                {...methods.register(`phNumbers.${index}.number` as const)}
              />
              {index > 0 && (
                <button
                  type="button"
                  className="submit"
                  onClick={() => remove(index)}
                >
                  remove
                </button>
              )}
            </div>
          ))}

          <div className="input-container ic2">
            <input
              id="age"
              className="input"
              type="number"
              placeholder="Age"
              {...methods.register('age', {
                valueAsNumber: true,
              })}
            />
          </div>

          <div className="input-container ic2">
            <input
              id="dob"
              className="input"
              type="date"
              placeholder="Date of birth"
              {...methods.register('dob', {
                valueAsDate: true,
              })}
            />
          </div>

          <div className="flex gap-4 align-bottom items-end mt-4">
            <button
              className="h-14 flex-grow"
              type="button"
              onClick={() => append({ number: '' })}
            >
              add phone
            </button>
            <button
              type="submit"
              className="h-14 flex-grow bg-blue-500 transition-colors"
            >
              submit
            </button>
          </div>
          <div>
            <button type='button' onClick={() => handleGetValue()}>Get value</button>
          </div>
        </form>
      </div>
    </FormProvider>
  );
};

export default YoutubeForm;
