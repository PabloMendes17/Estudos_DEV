import type{NextPage} from 'next';
import SafeEnvironment from 'ui/components/feedback/SafeEnvironment/SafeEnvironment';


const Home: NextPage = () =>{
    return (
    <div>Welcome to SERPRO
        <SafeEnvironment/>
    </div>
    )
}
export default Home